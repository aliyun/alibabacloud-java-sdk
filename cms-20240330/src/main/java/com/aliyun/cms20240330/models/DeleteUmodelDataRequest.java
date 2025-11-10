// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteUmodelDataRequest extends TeaModel {
    /**
     * <p>Can specify the name of a specific Umodel data, leaving it blank means all</p>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>Can specify the kind of a specific Umodel data, leaving it blank means all</p>
     * 
     * <strong>example:</strong>
     * <p>metric_set</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>Can specify the name of a specific Umodel data, leaving it blank means all</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    public static DeleteUmodelDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUmodelDataRequest self = new DeleteUmodelDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUmodelDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteUmodelDataRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public DeleteUmodelDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

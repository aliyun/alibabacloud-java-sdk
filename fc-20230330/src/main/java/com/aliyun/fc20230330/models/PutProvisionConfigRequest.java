// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutProvisionConfigRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("request")
    public PutProvisionConfigInput request;

    public static PutProvisionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigRequest self = new PutProvisionConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public PutProvisionConfigRequest setRequest(PutProvisionConfigInput request) {
        this.request = request;
        return this;
    }
    public PutProvisionConfigInput getRequest() {
        return this.request;
    }

}

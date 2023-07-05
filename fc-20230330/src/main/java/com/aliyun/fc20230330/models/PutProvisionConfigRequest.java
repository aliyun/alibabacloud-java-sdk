// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutProvisionConfigRequest extends TeaModel {
    @NameInMap("body")
    public PutProvisionConfigInput body;

    @NameInMap("qualifier")
    public String qualifier;

    public static PutProvisionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigRequest self = new PutProvisionConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigRequest setBody(PutProvisionConfigInput body) {
        this.body = body;
        return this;
    }
    public PutProvisionConfigInput getBody() {
        return this.body;
    }

    public PutProvisionConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutProvisionConfigRequest extends TeaModel {
    /**
     * <p>The provisioned configuration information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PutProvisionConfigInput body;

    /**
     * <p>The function alias.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
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

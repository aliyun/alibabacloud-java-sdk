// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutScalingConfigRequest extends TeaModel {
    /**
     * <p>The function scalability configuration.</p>
     */
    @NameInMap("body")
    public PutScalingConfigInput body;

    /**
     * <p>The function alias.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static PutScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutScalingConfigRequest self = new PutScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutScalingConfigRequest setBody(PutScalingConfigInput body) {
        this.body = body;
        return this;
    }
    public PutScalingConfigInput getBody() {
        return this.body;
    }

    public PutScalingConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

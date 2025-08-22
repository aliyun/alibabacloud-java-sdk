// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteTerraformDestroyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-xxx</p>
     */
    @NameInMap("stateId")
    public String stateId;

    public static ExecuteTerraformDestroyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTerraformDestroyRequest self = new ExecuteTerraformDestroyRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTerraformDestroyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteTerraformDestroyRequest setStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }
    public String getStateId() {
        return this.stateId;
    }

}

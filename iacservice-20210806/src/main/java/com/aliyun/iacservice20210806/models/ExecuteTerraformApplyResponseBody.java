// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteTerraformApplyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C896FE0A-1BEA-5D01-BFF4-B03B82B9CA3D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>task-xxxx</p>
     */
    @NameInMap("stateId")
    public String stateId;

    public static ExecuteTerraformApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTerraformApplyResponseBody self = new ExecuteTerraformApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTerraformApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTerraformApplyResponseBody setStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }
    public String getStateId() {
        return this.stateId;
    }

}

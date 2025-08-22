// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteTerraformPlanResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0D298375-F92F-5B65-82E4-EA68F02521F1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>task-xxxx</p>
     */
    @NameInMap("stateId")
    public String stateId;

    public static ExecuteTerraformPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTerraformPlanResponseBody self = new ExecuteTerraformPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTerraformPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTerraformPlanResponseBody setStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }
    public String getStateId() {
        return this.stateId;
    }

}

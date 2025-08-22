// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteTerraformDestroyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>task-xxxx</p>
     */
    @NameInMap("stateId")
    public String stateId;

    public static ExecuteTerraformDestroyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTerraformDestroyResponseBody self = new ExecuteTerraformDestroyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTerraformDestroyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTerraformDestroyResponseBody setStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }
    public String getStateId() {
        return this.stateId;
    }

}

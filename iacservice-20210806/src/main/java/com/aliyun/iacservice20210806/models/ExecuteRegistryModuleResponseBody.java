// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteRegistryModuleResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>79284133-D4BA-56B3-954C-D538256F7EAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>task-xxxx</p>
     */
    @NameInMap("stateId")
    public String stateId;

    public static ExecuteRegistryModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRegistryModuleResponseBody self = new ExecuteRegistryModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteRegistryModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteRegistryModuleResponseBody setStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }
    public String getStateId() {
        return this.stateId;
    }

}

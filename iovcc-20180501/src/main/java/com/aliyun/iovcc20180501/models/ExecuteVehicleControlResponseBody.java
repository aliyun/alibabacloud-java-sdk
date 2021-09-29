// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteVehicleControlResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExecutionInfo")
    public ExecuteVehicleControlResponseBodyExecutionInfo executionInfo;

    public static ExecuteVehicleControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteVehicleControlResponseBody self = new ExecuteVehicleControlResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteVehicleControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteVehicleControlResponseBody setExecutionInfo(ExecuteVehicleControlResponseBodyExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }
    public ExecuteVehicleControlResponseBodyExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    public static class ExecuteVehicleControlResponseBodyExecutionInfo extends TeaModel {
        @NameInMap("ExecutionId")
        public String executionId;

        public static ExecuteVehicleControlResponseBodyExecutionInfo build(java.util.Map<String, ?> map) throws Exception {
            ExecuteVehicleControlResponseBodyExecutionInfo self = new ExecuteVehicleControlResponseBodyExecutionInfo();
            return TeaModel.build(map, self);
        }

        public ExecuteVehicleControlResponseBodyExecutionInfo setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

    }

}

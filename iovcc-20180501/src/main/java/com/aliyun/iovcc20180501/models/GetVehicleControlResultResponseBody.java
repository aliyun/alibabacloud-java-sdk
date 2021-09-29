// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetVehicleControlResultResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExecutionInfo")
    public GetVehicleControlResultResponseBodyExecutionInfo executionInfo;

    public static GetVehicleControlResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleControlResultResponseBody self = new GetVehicleControlResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVehicleControlResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVehicleControlResultResponseBody setExecutionInfo(GetVehicleControlResultResponseBodyExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }
    public GetVehicleControlResultResponseBodyExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    public static class GetVehicleControlResultResponseBodyExecutionInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SubStatus")
        public String subStatus;

        public static GetVehicleControlResultResponseBodyExecutionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVehicleControlResultResponseBodyExecutionInfo self = new GetVehicleControlResultResponseBodyExecutionInfo();
            return TeaModel.build(map, self);
        }

        public GetVehicleControlResultResponseBodyExecutionInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVehicleControlResultResponseBodyExecutionInfo setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

    }

}

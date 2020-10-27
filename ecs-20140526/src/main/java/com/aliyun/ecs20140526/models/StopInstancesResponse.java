// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceResponses")
    @Validation(required = true)
    public StopInstancesResponseInstanceResponses instanceResponses;

    public static StopInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponse self = new StopInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StopInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopInstancesResponse setInstanceResponses(StopInstancesResponseInstanceResponses instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public StopInstancesResponseInstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public static class StopInstancesResponseInstanceResponsesInstanceResponse extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("PreviousStatus")
        @Validation(required = true)
        public String previousStatus;

        @NameInMap("CurrentStatus")
        @Validation(required = true)
        public String currentStatus;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StopInstancesResponseInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            StopInstancesResponseInstanceResponsesInstanceResponse self = new StopInstancesResponseInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

        public StopInstancesResponseInstanceResponsesInstanceResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StopInstancesResponseInstanceResponsesInstanceResponse setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public StopInstancesResponseInstanceResponsesInstanceResponse setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public StopInstancesResponseInstanceResponsesInstanceResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StopInstancesResponseInstanceResponsesInstanceResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class StopInstancesResponseInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        @Validation(required = true)
        public java.util.List<StopInstancesResponseInstanceResponsesInstanceResponse> instanceResponse;

        public static StopInstancesResponseInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            StopInstancesResponseInstanceResponses self = new StopInstancesResponseInstanceResponses();
            return TeaModel.build(map, self);
        }

        public StopInstancesResponseInstanceResponses setInstanceResponse(java.util.List<StopInstancesResponseInstanceResponsesInstanceResponse> instanceResponse) {
            this.instanceResponse = instanceResponse;
            return this;
        }
        public java.util.List<StopInstancesResponseInstanceResponsesInstanceResponse> getInstanceResponse() {
            return this.instanceResponse;
        }

    }

}

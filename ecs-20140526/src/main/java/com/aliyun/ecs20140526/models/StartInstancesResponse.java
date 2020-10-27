// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceResponses")
    @Validation(required = true)
    public StartInstancesResponseInstanceResponses instanceResponses;

    public static StartInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesResponse self = new StartInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StartInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartInstancesResponse setInstanceResponses(StartInstancesResponseInstanceResponses instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public StartInstancesResponseInstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public static class StartInstancesResponseInstanceResponsesInstanceResponse extends TeaModel {
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

        public static StartInstancesResponseInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            StartInstancesResponseInstanceResponsesInstanceResponse self = new StartInstancesResponseInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

        public StartInstancesResponseInstanceResponsesInstanceResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartInstancesResponseInstanceResponsesInstanceResponse setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public StartInstancesResponseInstanceResponsesInstanceResponse setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public StartInstancesResponseInstanceResponsesInstanceResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StartInstancesResponseInstanceResponsesInstanceResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class StartInstancesResponseInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        @Validation(required = true)
        public java.util.List<StartInstancesResponseInstanceResponsesInstanceResponse> instanceResponse;

        public static StartInstancesResponseInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            StartInstancesResponseInstanceResponses self = new StartInstancesResponseInstanceResponses();
            return TeaModel.build(map, self);
        }

        public StartInstancesResponseInstanceResponses setInstanceResponse(java.util.List<StartInstancesResponseInstanceResponsesInstanceResponse> instanceResponse) {
            this.instanceResponse = instanceResponse;
            return this;
        }
        public java.util.List<StartInstancesResponseInstanceResponsesInstanceResponse> getInstanceResponse() {
            return this.instanceResponse;
        }

    }

}

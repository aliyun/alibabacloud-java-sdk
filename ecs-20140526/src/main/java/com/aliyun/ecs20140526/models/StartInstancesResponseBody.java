// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceResponses")
    public StartInstancesResponseBodyInstanceResponses instanceResponses;

    public static StartInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesResponseBody self = new StartInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StartInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartInstancesResponseBody setInstanceResponses(StartInstancesResponseBodyInstanceResponses instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public StartInstancesResponseBodyInstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public static class StartInstancesResponseBodyInstanceResponsesInstanceResponse extends TeaModel {
        @NameInMap("CurrentStatus")
        public String currentStatus;

        @NameInMap("PreviousStatus")
        public String previousStatus;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("InstanceId")
        public String instanceId;

        public static StartInstancesResponseBodyInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            StartInstancesResponseBodyInstanceResponsesInstanceResponse self = new StartInstancesResponseBodyInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class StartInstancesResponseBodyInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        public java.util.List<StartInstancesResponseBodyInstanceResponsesInstanceResponse> instanceResponse;

        public static StartInstancesResponseBodyInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            StartInstancesResponseBodyInstanceResponses self = new StartInstancesResponseBodyInstanceResponses();
            return TeaModel.build(map, self);
        }

        public StartInstancesResponseBodyInstanceResponses setInstanceResponse(java.util.List<StartInstancesResponseBodyInstanceResponsesInstanceResponse> instanceResponse) {
            this.instanceResponse = instanceResponse;
            return this;
        }
        public java.util.List<StartInstancesResponseBodyInstanceResponsesInstanceResponse> getInstanceResponse() {
            return this.instanceResponse;
        }

    }

}

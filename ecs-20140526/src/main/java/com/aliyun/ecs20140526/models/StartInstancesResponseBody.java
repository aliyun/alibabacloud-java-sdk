// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about the responses returned for the instances, which contains the state of each instance before and after the operation is called and the operation results.</p>
     */
    @NameInMap("InstanceResponses")
    public StartInstancesResponseBodyInstanceResponses instanceResponses;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesResponseBody self = new StartInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StartInstancesResponseBody setInstanceResponses(StartInstancesResponseBodyInstanceResponses instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public StartInstancesResponseBodyInstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public StartInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartInstancesResponseBodyInstanceResponsesInstanceResponse extends TeaModel {
        /**
         * <p>The error code returned for the instance. A return value of 200 indicates success. For more information, see the "Error codes" section in this topic.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The current state of the instance.</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The error message returned for the instance. A return value of success indicates operation success. For more information, see the "Error codes" section in this topic.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The state of the instance before the operation is called.</p>
         */
        @NameInMap("PreviousStatus")
        public String previousStatus;

        public static StartInstancesResponseBodyInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            StartInstancesResponseBodyInstanceResponsesInstanceResponse self = new StartInstancesResponseBodyInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StartInstancesResponseBodyInstanceResponsesInstanceResponse setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about the responses returned for the instances, which contain the status of each instance before and after the operation is called and the operation results.</p>
     */
    @NameInMap("InstanceResponses")
    public StopInstancesResponseBodyInstanceResponses instanceResponses;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponseBody self = new StopInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstancesResponseBody setInstanceResponses(StopInstancesResponseBodyInstanceResponses instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public StopInstancesResponseBodyInstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public StopInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopInstancesResponseBodyInstanceResponsesInstanceResponse extends TeaModel {
        /**
         * <p>The error code that is returned for the operation on the instance. A return value of 200 indicates success. For more information, see the "Error codes" section in this topic.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The current state of the instance.</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The error message that is returned for the operation on the instance. A return value of Success indicates that this operation is successful. For more information, see the "Error codes" section in this topic.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The state of the instance before the operation is called.</p>
         */
        @NameInMap("PreviousStatus")
        public String previousStatus;

        public static StopInstancesResponseBodyInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            StopInstancesResponseBodyInstanceResponsesInstanceResponse self = new StopInstancesResponseBodyInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

        public StopInstancesResponseBodyInstanceResponsesInstanceResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StopInstancesResponseBodyInstanceResponsesInstanceResponse setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public StopInstancesResponseBodyInstanceResponsesInstanceResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StopInstancesResponseBodyInstanceResponsesInstanceResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopInstancesResponseBodyInstanceResponsesInstanceResponse setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

    }

    public static class StopInstancesResponseBodyInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        public java.util.List<StopInstancesResponseBodyInstanceResponsesInstanceResponse> instanceResponse;

        public static StopInstancesResponseBodyInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            StopInstancesResponseBodyInstanceResponses self = new StopInstancesResponseBodyInstanceResponses();
            return TeaModel.build(map, self);
        }

        public StopInstancesResponseBodyInstanceResponses setInstanceResponse(java.util.List<StopInstancesResponseBodyInstanceResponsesInstanceResponse> instanceResponse) {
            this.instanceResponse = instanceResponse;
            return this;
        }
        public java.util.List<StopInstancesResponseBodyInstanceResponsesInstanceResponse> getInstanceResponse() {
            return this.instanceResponse;
        }

    }

}

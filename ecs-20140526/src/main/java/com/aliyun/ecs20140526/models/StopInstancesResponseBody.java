// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesResponseBody extends TeaModel {
    /**
     * <p>The instance-specific responses, which contain the status of each instance before and after the operation was called and the results of the operation.</p>
     */
    @NameInMap("InstanceResponses")
    public StopInstancesResponseBodyInstanceResponses instanceResponses;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C488B66-B819-4D14-8711-C4EAAA13AC01</p>
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
         * <p>The error code returned for the instance. A return value of 200 indicates that the operation was successful. For more information, see the &quot;Error codes&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The current status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Stopping</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The error message returned for the instance. The return value <code>success</code> indicates that the operation is successful. For more information, see the &quot;Error codes&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The status of the instance before the operation was called.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
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

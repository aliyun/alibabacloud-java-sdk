// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about instance-specific responses, which contain the status of each instance before and after the operation is called and the results of the operation.</p>
     */
    @NameInMap("InstanceResponses")
    public RebootInstancesResponseBodyInstanceResponses instanceResponses;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponseBody self = new RebootInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootInstancesResponseBody setInstanceResponses(RebootInstancesResponseBodyInstanceResponses instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public RebootInstancesResponseBodyInstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public RebootInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RebootInstancesResponseBodyInstanceResponsesInstanceResponse extends TeaModel {
        /**
         * <p>The error code returned for the instance. A return value of 200 indicates that the operation is successful. For more information, see the &quot;Error codes&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The current state of the instance.</p>
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
         * <p>i-bp1g6zv0ce8oghu7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The error message that is returned for the operation on the instance. The return value Success indicates that the operation is successful. For more information, see the &quot;Error codes&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The state of the instance before the operation is called.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("PreviousStatus")
        public String previousStatus;

        public static RebootInstancesResponseBodyInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            RebootInstancesResponseBodyInstanceResponsesInstanceResponse self = new RebootInstancesResponseBodyInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

        public RebootInstancesResponseBodyInstanceResponsesInstanceResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RebootInstancesResponseBodyInstanceResponsesInstanceResponse setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public RebootInstancesResponseBodyInstanceResponsesInstanceResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RebootInstancesResponseBodyInstanceResponsesInstanceResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RebootInstancesResponseBodyInstanceResponsesInstanceResponse setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

    }

    public static class RebootInstancesResponseBodyInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        public java.util.List<RebootInstancesResponseBodyInstanceResponsesInstanceResponse> instanceResponse;

        public static RebootInstancesResponseBodyInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            RebootInstancesResponseBodyInstanceResponses self = new RebootInstancesResponseBodyInstanceResponses();
            return TeaModel.build(map, self);
        }

        public RebootInstancesResponseBodyInstanceResponses setInstanceResponse(java.util.List<RebootInstancesResponseBodyInstanceResponsesInstanceResponse> instanceResponse) {
            this.instanceResponse = instanceResponse;
            return this;
        }
        public java.util.List<RebootInstancesResponseBodyInstanceResponsesInstanceResponse> getInstanceResponse() {
            return this.instanceResponse;
        }

    }

}

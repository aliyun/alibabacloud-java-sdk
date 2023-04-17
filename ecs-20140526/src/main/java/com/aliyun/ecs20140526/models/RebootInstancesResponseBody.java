// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceResponses")
    public RebootInstancesResponseBodyInstanceResponses instanceResponses;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("CurrentStatus")
        public String currentStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Message")
        public String message;

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

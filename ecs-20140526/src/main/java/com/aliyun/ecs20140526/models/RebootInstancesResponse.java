// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceResponses")
    @Validation(required = true)
    public RebootInstancesResponseInstanceResponses instanceResponses;

    public static RebootInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponse self = new RebootInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RebootInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebootInstancesResponse setInstanceResponses(RebootInstancesResponseInstanceResponses instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public RebootInstancesResponseInstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public static class RebootInstancesResponseInstanceResponsesInstanceResponse extends TeaModel {
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

        public static RebootInstancesResponseInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            RebootInstancesResponseInstanceResponsesInstanceResponse self = new RebootInstancesResponseInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

        public RebootInstancesResponseInstanceResponsesInstanceResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RebootInstancesResponseInstanceResponsesInstanceResponse setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public RebootInstancesResponseInstanceResponsesInstanceResponse setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public RebootInstancesResponseInstanceResponsesInstanceResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RebootInstancesResponseInstanceResponsesInstanceResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class RebootInstancesResponseInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        @Validation(required = true)
        public java.util.List<RebootInstancesResponseInstanceResponsesInstanceResponse> instanceResponse;

        public static RebootInstancesResponseInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            RebootInstancesResponseInstanceResponses self = new RebootInstancesResponseInstanceResponses();
            return TeaModel.build(map, self);
        }

        public RebootInstancesResponseInstanceResponses setInstanceResponse(java.util.List<RebootInstancesResponseInstanceResponsesInstanceResponse> instanceResponse) {
            this.instanceResponse = instanceResponse;
            return this;
        }
        public java.util.List<RebootInstancesResponseInstanceResponsesInstanceResponse> getInstanceResponse() {
            return this.instanceResponse;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceResponses")
    public java.util.List<RebootInstancesResponseBodyInstanceResponses> instanceResponses;

    public static RebootInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponseBody self = new RebootInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebootInstancesResponseBody setInstanceResponses(java.util.List<RebootInstancesResponseBodyInstanceResponses> instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public java.util.List<RebootInstancesResponseBodyInstanceResponses> getInstanceResponses() {
        return this.instanceResponses;
    }

    public static class RebootInstancesResponseBodyInstanceResponses extends TeaModel {
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

        public static RebootInstancesResponseBodyInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            RebootInstancesResponseBodyInstanceResponses self = new RebootInstancesResponseBodyInstanceResponses();
            return TeaModel.build(map, self);
        }

        public RebootInstancesResponseBodyInstanceResponses setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public RebootInstancesResponseBodyInstanceResponses setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public RebootInstancesResponseBodyInstanceResponses setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RebootInstancesResponseBodyInstanceResponses setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RebootInstancesResponseBodyInstanceResponses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}

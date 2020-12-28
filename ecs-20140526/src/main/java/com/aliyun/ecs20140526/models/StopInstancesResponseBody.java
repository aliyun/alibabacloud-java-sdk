// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceResponses")
    public java.util.List<StopInstancesResponseBodyInstanceResponses> instanceResponses;

    public static StopInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponseBody self = new StopInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopInstancesResponseBody setInstanceResponses(java.util.List<StopInstancesResponseBodyInstanceResponses> instanceResponses) {
        this.instanceResponses = instanceResponses;
        return this;
    }
    public java.util.List<StopInstancesResponseBodyInstanceResponses> getInstanceResponses() {
        return this.instanceResponses;
    }

    public static class StopInstancesResponseBodyInstanceResponses extends TeaModel {
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

        public static StopInstancesResponseBodyInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            StopInstancesResponseBodyInstanceResponses self = new StopInstancesResponseBodyInstanceResponses();
            return TeaModel.build(map, self);
        }

        public StopInstancesResponseBodyInstanceResponses setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public StopInstancesResponseBodyInstanceResponses setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public StopInstancesResponseBodyInstanceResponses setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StopInstancesResponseBodyInstanceResponses setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopInstancesResponseBodyInstanceResponses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}

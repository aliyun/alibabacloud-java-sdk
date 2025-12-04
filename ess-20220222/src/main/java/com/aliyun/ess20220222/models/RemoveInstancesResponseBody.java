// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RemoveInstancesResponseBody extends TeaModel {
    @NameInMap("IgnoredInstances")
    public java.util.List<RemoveInstancesResponseBodyIgnoredInstances> ignoredInstances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp175o6f6ego3r2j****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static RemoveInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstancesResponseBody self = new RemoveInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveInstancesResponseBody setIgnoredInstances(java.util.List<RemoveInstancesResponseBodyIgnoredInstances> ignoredInstances) {
        this.ignoredInstances = ignoredInstances;
        return this;
    }
    public java.util.List<RemoveInstancesResponseBodyIgnoredInstances> getIgnoredInstances() {
        return this.ignoredInstances;
    }

    public RemoveInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveInstancesResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static class RemoveInstancesResponseBodyIgnoredInstances extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Message")
        public String message;

        public static RemoveInstancesResponseBodyIgnoredInstances build(java.util.Map<String, ?> map) throws Exception {
            RemoveInstancesResponseBodyIgnoredInstances self = new RemoveInstancesResponseBodyIgnoredInstances();
            return TeaModel.build(map, self);
        }

        public RemoveInstancesResponseBodyIgnoredInstances setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveInstancesResponseBodyIgnoredInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RemoveInstancesResponseBodyIgnoredInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class RunInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceIdSets")
    public InstanceIdSets instanceIdSets;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static RunInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesResponseBody self = new RunInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RunInstancesResponseBody setInstanceIdSets(InstanceIdSets instanceIdSets) {
        this.instanceIdSets = instanceIdSets;
        return this;
    }
    public InstanceIdSets getInstanceIdSets() {
        return this.instanceIdSets;
    }

    public RunInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunInstancesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class InstanceIdSets extends TeaModel {
        @NameInMap("InstanceIdSet")
        public java.util.List<String> instanceIdSet;

        public static InstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            InstanceIdSets self = new InstanceIdSets();
            return TeaModel.build(map, self);
        }

        public InstanceIdSets setInstanceIdSet(java.util.List<String> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<String> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}

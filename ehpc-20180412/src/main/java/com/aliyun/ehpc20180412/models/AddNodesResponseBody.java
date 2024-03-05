// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddNodesResponseBody extends TeaModel {
    /**
     * <p>The instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public AddNodesResponseBodyInstanceIds instanceIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static AddNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddNodesResponseBody self = new AddNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddNodesResponseBody setInstanceIds(AddNodesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public AddNodesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public AddNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class AddNodesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static AddNodesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            AddNodesResponseBodyInstanceIds self = new AddNodesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public AddNodesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}

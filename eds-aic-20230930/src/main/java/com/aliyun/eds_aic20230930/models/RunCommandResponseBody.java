// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    /**
     * <p>The command execution ID. You can use this ID to query the command execution result.</p>
     * 
     * <strong>example:</strong>
     * <p>t-gov2ujrk32v4****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>440D7342-5E7C-B2DB-D0B4EAC2BDF1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of command execution information for each cloud phone instance.</p>
     */
    @NameInMap("RunCommandInfos")
    public java.util.List<RunCommandResponseBodyRunCommandInfos> runCommandInfos;

    /**
     * <p>The batch task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bp67acfmxazb4p****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RunCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponseBody self = new RunCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public RunCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCommandResponseBody setRunCommandInfos(java.util.List<RunCommandResponseBodyRunCommandInfos> runCommandInfos) {
        this.runCommandInfos = runCommandInfos;
        return this;
    }
    public java.util.List<RunCommandResponseBodyRunCommandInfos> getRunCommandInfos() {
        return this.runCommandInfos;
    }

    public RunCommandResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class RunCommandResponseBodyRunCommandInfos extends TeaModel {
        /**
         * <p>The instance-level child task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-bp67acfmxazb4p****</p>
         */
        @NameInMap("ChildTaskId")
        public String childTaskId;

        /**
         * <p>The cloud phone instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The command execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B8ED2BA9-0C6A-5643-818F-B5D60A64****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        public static RunCommandResponseBodyRunCommandInfos build(java.util.Map<String, ?> map) throws Exception {
            RunCommandResponseBodyRunCommandInfos self = new RunCommandResponseBodyRunCommandInfos();
            return TeaModel.build(map, self);
        }

        public RunCommandResponseBodyRunCommandInfos setChildTaskId(String childTaskId) {
            this.childTaskId = childTaskId;
            return this;
        }
        public String getChildTaskId() {
            return this.childTaskId;
        }

        public RunCommandResponseBodyRunCommandInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RunCommandResponseBodyRunCommandInfos setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

    }

}

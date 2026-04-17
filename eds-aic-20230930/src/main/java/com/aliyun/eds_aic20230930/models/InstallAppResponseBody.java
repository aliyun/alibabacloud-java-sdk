// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallAppResponseBody extends TeaModel {
    @NameInMap("ChildTaskInfo")
    public java.util.List<InstallAppResponseBodyChildTaskInfo> childTaskInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E5138F7E-46B5-526A-8C99-82DEAE6B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>t-14xwibw7yp73q****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static InstallAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAppResponseBody self = new InstallAppResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAppResponseBody setChildTaskInfo(java.util.List<InstallAppResponseBodyChildTaskInfo> childTaskInfo) {
        this.childTaskInfo = childTaskInfo;
        return this;
    }
    public java.util.List<InstallAppResponseBodyChildTaskInfo> getChildTaskInfo() {
        return this.childTaskInfo;
    }

    public InstallAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallAppResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class InstallAppResponseBodyChildTaskInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>t-ybde48cevxxxx</p>
         */
        @NameInMap("ChildTaskId")
        public String childTaskId;

        /**
         * <strong>example:</strong>
         * <p>acp-ty3bnd7b9xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static InstallAppResponseBodyChildTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            InstallAppResponseBodyChildTaskInfo self = new InstallAppResponseBodyChildTaskInfo();
            return TeaModel.build(map, self);
        }

        public InstallAppResponseBodyChildTaskInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InstallAppResponseBodyChildTaskInfo setChildTaskId(String childTaskId) {
            this.childTaskId = childTaskId;
            return this;
        }
        public String getChildTaskId() {
            return this.childTaskId;
        }

        public InstallAppResponseBodyChildTaskInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}

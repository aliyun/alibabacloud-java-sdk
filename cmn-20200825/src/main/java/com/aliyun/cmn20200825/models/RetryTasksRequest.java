// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class RetryTasksRequest extends TeaModel {
    // 重执行任务的数组
    @NameInMap("RetryTasks")
    public java.util.List<RetryTasksRequestRetryTasks> retryTasks;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static RetryTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryTasksRequest self = new RetryTasksRequest();
        return TeaModel.build(map, self);
    }

    public RetryTasksRequest setRetryTasks(java.util.List<RetryTasksRequestRetryTasks> retryTasks) {
        this.retryTasks = retryTasks;
        return this;
    }
    public java.util.List<RetryTasksRequestRetryTasks> getRetryTasks() {
        return this.retryTasks;
    }

    public RetryTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class RetryTasksRequestRetryTasks extends TeaModel {
        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 脚本ID
        @NameInMap("ScriptId")
        public String scriptId;

        public static RetryTasksRequestRetryTasks build(java.util.Map<String, ?> map) throws Exception {
            RetryTasksRequestRetryTasks self = new RetryTasksRequestRetryTasks();
            return TeaModel.build(map, self);
        }

        public RetryTasksRequestRetryTasks setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public RetryTasksRequestRetryTasks setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveMPUTaskRequest extends TeaModel {
    /**
     * <p>The application ID. Only a single ID can be specified. The ID can contain uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters. You can view your application IDs by navigating to <strong>ApsaraVideo Live &gt; Live+ &gt; ApsaraVideo Real-time Communication &gt; Application Management</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The task ID. Only a single ID can be specified. The ID can contain uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 55 characters. This ID serves as the identifier for the bypass forwarding task and must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopLiveMPUTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLiveMPUTaskRequest self = new StopLiveMPUTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopLiveMPUTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopLiveMPUTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

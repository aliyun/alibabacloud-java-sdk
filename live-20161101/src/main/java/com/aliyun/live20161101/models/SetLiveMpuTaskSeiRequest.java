// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveMpuTaskSeiRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p> The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The custom SEI.</p>
     * <blockquote>
     * <p> The value is a JSON string that can be up to 4,096 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;myroom&quot;}</p>
     */
    @NameInMap("CustomSei")
    public String customSei;

    /**
     * <p>The task ID.</p>
     * <blockquote>
     * <p> The ID can be up to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AL-4bce036dd90277c50705b0599wgfffc7</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SetLiveMpuTaskSeiRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveMpuTaskSeiRequest self = new SetLiveMpuTaskSeiRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveMpuTaskSeiRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetLiveMpuTaskSeiRequest setCustomSei(String customSei) {
        this.customSei = customSei;
        return this;
    }
    public String getCustomSei() {
        return this.customSei;
    }

    public SetLiveMpuTaskSeiRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

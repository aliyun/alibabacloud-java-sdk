// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyProjectPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Clipboard")
    public Integer clipboard;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FileTransfer")
    public Integer fileTransfer;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("FrameRate")
    public Integer frameRate;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("KeepAliveDuration")
    public Integer keepAliveDuration;

    /**
     * <strong>example:</strong>
     * <p>p-065z4tu9ak07h****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("SessionResolutionHeight")
    public Integer sessionResolutionHeight;

    /**
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("SessionResolutionWidth")
    public Integer sessionResolutionWidth;

    /**
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("StreamingMode")
    public String streamingMode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminalResolutionAdaptation")
    public Boolean terminalResolutionAdaptation;

    public static ModifyProjectPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectPolicyRequest self = new ModifyProjectPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectPolicyRequest setClipboard(Integer clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public Integer getClipboard() {
        return this.clipboard;
    }

    public ModifyProjectPolicyRequest setFileTransfer(Integer fileTransfer) {
        this.fileTransfer = fileTransfer;
        return this;
    }
    public Integer getFileTransfer() {
        return this.fileTransfer;
    }

    public ModifyProjectPolicyRequest setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Integer getFrameRate() {
        return this.frameRate;
    }

    public ModifyProjectPolicyRequest setKeepAliveDuration(Integer keepAliveDuration) {
        this.keepAliveDuration = keepAliveDuration;
        return this;
    }
    public Integer getKeepAliveDuration() {
        return this.keepAliveDuration;
    }

    public ModifyProjectPolicyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyProjectPolicyRequest setSessionResolutionHeight(Integer sessionResolutionHeight) {
        this.sessionResolutionHeight = sessionResolutionHeight;
        return this;
    }
    public Integer getSessionResolutionHeight() {
        return this.sessionResolutionHeight;
    }

    public ModifyProjectPolicyRequest setSessionResolutionWidth(Integer sessionResolutionWidth) {
        this.sessionResolutionWidth = sessionResolutionWidth;
        return this;
    }
    public Integer getSessionResolutionWidth() {
        return this.sessionResolutionWidth;
    }

    public ModifyProjectPolicyRequest setStreamingMode(String streamingMode) {
        this.streamingMode = streamingMode;
        return this;
    }
    public String getStreamingMode() {
        return this.streamingMode;
    }

    public ModifyProjectPolicyRequest setTerminalResolutionAdaptation(Boolean terminalResolutionAdaptation) {
        this.terminalResolutionAdaptation = terminalResolutionAdaptation;
        return this;
    }
    public Boolean getTerminalResolutionAdaptation() {
        return this.terminalResolutionAdaptation;
    }

}

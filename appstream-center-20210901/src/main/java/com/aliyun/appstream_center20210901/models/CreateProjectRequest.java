// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Clipboard")
    public Integer clipboard;

    /**
     * <strong>example:</strong>
     * <p>c-xxxxxxx</p>
     */
    @NameInMap("CloudEnvId")
    public String cloudEnvId;

    /**
     * <strong>example:</strong>
     * <p>c-06vcpamarryyq****</p>
     */
    @NameInMap("ContentId")
    public String contentId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>notepad++xxxxx</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

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

    @NameInMap("SessionSpec")
    public String sessionSpec;

    /**
     * <strong>example:</strong>
     * <p>mix</p>
     */
    @NameInMap("StreamingMode")
    public String streamingMode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminalResolutionAdaptation")
    public Boolean terminalResolutionAdaptation;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setClipboard(Integer clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public Integer getClipboard() {
        return this.clipboard;
    }

    public CreateProjectRequest setCloudEnvId(String cloudEnvId) {
        this.cloudEnvId = cloudEnvId;
        return this;
    }
    public String getCloudEnvId() {
        return this.cloudEnvId;
    }

    public CreateProjectRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setFileTransfer(Integer fileTransfer) {
        this.fileTransfer = fileTransfer;
        return this;
    }
    public Integer getFileTransfer() {
        return this.fileTransfer;
    }

    public CreateProjectRequest setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public Integer getFrameRate() {
        return this.frameRate;
    }

    public CreateProjectRequest setKeepAliveDuration(Integer keepAliveDuration) {
        this.keepAliveDuration = keepAliveDuration;
        return this;
    }
    public Integer getKeepAliveDuration() {
        return this.keepAliveDuration;
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectRequest setSessionResolutionHeight(Integer sessionResolutionHeight) {
        this.sessionResolutionHeight = sessionResolutionHeight;
        return this;
    }
    public Integer getSessionResolutionHeight() {
        return this.sessionResolutionHeight;
    }

    public CreateProjectRequest setSessionResolutionWidth(Integer sessionResolutionWidth) {
        this.sessionResolutionWidth = sessionResolutionWidth;
        return this;
    }
    public Integer getSessionResolutionWidth() {
        return this.sessionResolutionWidth;
    }

    public CreateProjectRequest setSessionSpec(String sessionSpec) {
        this.sessionSpec = sessionSpec;
        return this;
    }
    public String getSessionSpec() {
        return this.sessionSpec;
    }

    public CreateProjectRequest setStreamingMode(String streamingMode) {
        this.streamingMode = streamingMode;
        return this;
    }
    public String getStreamingMode() {
        return this.streamingMode;
    }

    public CreateProjectRequest setTerminalResolutionAdaptation(Boolean terminalResolutionAdaptation) {
        this.terminalResolutionAdaptation = terminalResolutionAdaptation;
        return this;
    }
    public Boolean getTerminalResolutionAdaptation() {
        return this.terminalResolutionAdaptation;
    }

}

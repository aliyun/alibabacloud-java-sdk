// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMobile")
    public Boolean isMobile;

    @NameInMap("Outline")
    public String outline;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PptTemplateId")
    public Integer pptTemplateId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PptTemplateType")
    public Integer pptTemplateType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessType")
    public Integer processType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8a7dfece-f204-4380-a7d0-a13d37de3924</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static InitiatePptCreationV2Request build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationV2Request self = new InitiatePptCreationV2Request();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationV2Request setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public InitiatePptCreationV2Request setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
        return this;
    }
    public Boolean getIsMobile() {
        return this.isMobile;
    }

    public InitiatePptCreationV2Request setOutline(String outline) {
        this.outline = outline;
        return this;
    }
    public String getOutline() {
        return this.outline;
    }

    public InitiatePptCreationV2Request setPptTemplateId(Integer pptTemplateId) {
        this.pptTemplateId = pptTemplateId;
        return this;
    }
    public Integer getPptTemplateId() {
        return this.pptTemplateId;
    }

    public InitiatePptCreationV2Request setPptTemplateType(Integer pptTemplateType) {
        this.pptTemplateType = pptTemplateType;
        return this;
    }
    public Integer getPptTemplateType() {
        return this.pptTemplateType;
    }

    public InitiatePptCreationV2Request setProcessType(Integer processType) {
        this.processType = processType;
        return this;
    }
    public Integer getProcessType() {
        return this.processType;
    }

    public InitiatePptCreationV2Request setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public InitiatePptCreationV2Request setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

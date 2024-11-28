// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ValidateUploadTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Content</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <strong>example:</strong>
     * <p>lightAppSass</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Content</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ValidateUploadTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateUploadTemplateRequest self = new ValidateUploadTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ValidateUploadTemplateRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ValidateUploadTemplateRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ValidateUploadTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ValidateUploadTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

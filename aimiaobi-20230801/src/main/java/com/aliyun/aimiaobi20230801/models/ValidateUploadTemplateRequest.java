// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ValidateUploadTemplateRequest extends TeaModel {
    /**
     * <p>File key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Content</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>Task type. Valid values: lightAppSass (SaaS page call) or sdkBatchTask (SDK batch task).</p>
     * 
     * <strong>example:</strong>
     * <p>lightAppSass</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>Template type. Valid values: Content (content asset template) or PositiveSample (positive sample template).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Content</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>Unique identifier of your Alibaba Cloud Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
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

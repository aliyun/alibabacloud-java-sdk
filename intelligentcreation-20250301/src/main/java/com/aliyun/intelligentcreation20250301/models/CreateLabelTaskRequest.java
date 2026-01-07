// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateLabelTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/callback">https://example.com/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket-name.oss-zhangjiakou.aliyuncs.com/path/filename.jsonl">https://bucket-name.oss-zhangjiakou.aliyuncs.com/path/filename.jsonl</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>abcdefg1234567</p>
     */
    @NameInMap("IdempotentId")
    public String idempotentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("LabelTemplateId")
    public String labelTemplateId;

    /**
     * <strong>example:</strong>
     * <p>1733766254635026</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateLabelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTaskRequest self = new CreateLabelTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabelTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateLabelTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateLabelTaskRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public CreateLabelTaskRequest setLabelTemplateId(String labelTemplateId) {
        this.labelTemplateId = labelTemplateId;
        return this;
    }
    public String getLabelTemplateId() {
        return this.labelTemplateId;
    }

    public CreateLabelTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}

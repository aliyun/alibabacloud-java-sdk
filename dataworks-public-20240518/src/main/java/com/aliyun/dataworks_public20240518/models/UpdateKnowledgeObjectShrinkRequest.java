// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeObjectShrinkRequest extends TeaModel {
    /**
     * <p>The client token. This parameter is supported only for DOCUMENT. Model updates do not guarantee exactly-once remote save notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>edit-document-text-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The typed content update. Object properties are submitted as needed. Arrays are replaced in their entirety when submitted. Unspecified properties are retained.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The new description. An empty string clears the description. If this parameter is not specified, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Actual paid amount</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expected modification time. This parameter is supported only for DOCUMENT. It is required when modifying the body text and optional when modifying metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>1790200800000</p>
     */
    @NameInMap("ExpectedModifyTime")
    public Long expectedModifyTime;

    /**
     * <p>The ID of the knowledge base to which the object belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The stable knowledge object ID returned by the Get or List operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>obj-model-001</p>
     */
    @NameInMap("KnowledgeObjectId")
    public String knowledgeObjectId;

    /**
     * <p>The new name. This parameter cannot be empty. If this parameter is not specified, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The upload ID. This parameter is supported only for SEMANTIC_MODEL. It replaces the public model content with a complete YAML file and is mutually exclusive with Content.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abd</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    /**
     * <p>The version number. This parameter is required when updating Content or UploadId for SEMANTIC_MODEL. Use the VersionNo returned by the Get operation. This is not an optimistic lock.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionNo")
    public Long versionNo;

    public static UpdateKnowledgeObjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeObjectShrinkRequest self = new UpdateKnowledgeObjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeObjectShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateKnowledgeObjectShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public UpdateKnowledgeObjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeObjectShrinkRequest setExpectedModifyTime(Long expectedModifyTime) {
        this.expectedModifyTime = expectedModifyTime;
        return this;
    }
    public Long getExpectedModifyTime() {
        return this.expectedModifyTime;
    }

    public UpdateKnowledgeObjectShrinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeObjectShrinkRequest setKnowledgeObjectId(String knowledgeObjectId) {
        this.knowledgeObjectId = knowledgeObjectId;
        return this;
    }
    public String getKnowledgeObjectId() {
        return this.knowledgeObjectId;
    }

    public UpdateKnowledgeObjectShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeObjectShrinkRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public UpdateKnowledgeObjectShrinkRequest setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public Long getVersionNo() {
        return this.versionNo;
    }

}

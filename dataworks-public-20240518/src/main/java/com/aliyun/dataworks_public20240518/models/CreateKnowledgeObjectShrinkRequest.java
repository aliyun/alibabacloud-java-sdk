// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeObjectShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency token for the creation request. Keep the original request unchanged when retrying.</p>
     * 
     * <strong>example:</strong>
     * <p>create-document-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Only Content.Document is supported. It includes Text and ContentFormat (MARKDOWN or TEXT).</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The document description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy document</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the target knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The document name. Existing objects are not overwritten based on the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business description</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the object. For this operation, the value is fixed to DOCUMENT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCUMENT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the completed PUT upload session for this knowledge base. This parameter is mutually exclusive with Content.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abd</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    public static CreateKnowledgeObjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeObjectShrinkRequest self = new CreateKnowledgeObjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeObjectShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeObjectShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public CreateKnowledgeObjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeObjectShrinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeObjectShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeObjectShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateKnowledgeObjectShrinkRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}

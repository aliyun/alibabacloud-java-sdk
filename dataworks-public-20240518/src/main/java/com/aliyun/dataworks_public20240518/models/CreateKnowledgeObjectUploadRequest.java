// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeObjectUploadRequest extends TeaModel {
    /**
     * <p>The idempotency key for the upload request.</p>
     * 
     * <strong>example:</strong>
     * <p>upload-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The Base64-encoded MD5 hash value of the original file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yaNM/IXZgmmMasifdgcavQ==</p>
     */
    @NameInMap("ContentMd5")
    public String contentMd5;

    /**
     * <p>The SHA-256 checksum of the original file.</p>
     * 
     * <strong>example:</strong>
     * <p>ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad</p>
     */
    @NameInMap("ContentSha256")
    public String contentSha256;

    /**
     * <p>The HTTP media type for the upload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text/markdown</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The original file name, which is not used as the object ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>policy.md</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The target knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The size of the original file in bytes. This parameter reuses the existing maximum size limit for single-file uploads, which defaults to 100 MiB. If the size exceeds the limit, the InputTooLarge error is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SizeBytes")
    public Long sizeBytes;

    public static CreateKnowledgeObjectUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeObjectUploadRequest self = new CreateKnowledgeObjectUploadRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeObjectUploadRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeObjectUploadRequest setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public CreateKnowledgeObjectUploadRequest setContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
        return this;
    }
    public String getContentSha256() {
        return this.contentSha256;
    }

    public CreateKnowledgeObjectUploadRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateKnowledgeObjectUploadRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateKnowledgeObjectUploadRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeObjectUploadRequest setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

}

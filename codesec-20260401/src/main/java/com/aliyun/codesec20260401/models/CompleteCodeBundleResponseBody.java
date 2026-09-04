// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CompleteCodeBundleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bundleVersion")
    public String bundleVersion;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("byteSize")
    public Long byteSize;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("codeBundleId")
    public Long codeBundleId;

    /**
     * <strong>example:</strong>
     * <p>application/octet-stream</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>代码包创建时间（RFC3339）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>test-cases.zip</p>
     */
    @NameInMap("filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>76851f2b5bf0187fbc29e8bca4</p>
     */
    @NameInMap("projectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>代码包更新时间（RFC3339）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    public static CompleteCodeBundleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteCodeBundleResponseBody self = new CompleteCodeBundleResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteCodeBundleResponseBody setBundleVersion(String bundleVersion) {
        this.bundleVersion = bundleVersion;
        return this;
    }
    public String getBundleVersion() {
        return this.bundleVersion;
    }

    public CompleteCodeBundleResponseBody setByteSize(Long byteSize) {
        this.byteSize = byteSize;
        return this;
    }
    public Long getByteSize() {
        return this.byteSize;
    }

    public CompleteCodeBundleResponseBody setCodeBundleId(Long codeBundleId) {
        this.codeBundleId = codeBundleId;
        return this;
    }
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    public CompleteCodeBundleResponseBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CompleteCodeBundleResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CompleteCodeBundleResponseBody setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CompleteCodeBundleResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CompleteCodeBundleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompleteCodeBundleResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CompleteCodeBundleResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}

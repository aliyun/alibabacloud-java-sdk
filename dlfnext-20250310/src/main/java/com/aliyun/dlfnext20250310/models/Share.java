// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Share extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("enableWrite")
    public Boolean enableWrite;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("providerTenantId")
    public Long providerTenantId;

    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("shareId")
    public String shareId;

    /**
     * <strong>example:</strong>
     * <p>share_name</p>
     */
    @NameInMap("shareName")
    public String shareName;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    public static Share build(java.util.Map<String, ?> map) throws Exception {
        Share self = new Share();
        return TeaModel.build(map, self);
    }

    public Share setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Share setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Share setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Share setEnableWrite(Boolean enableWrite) {
        this.enableWrite = enableWrite;
        return this;
    }
    public Boolean getEnableWrite() {
        return this.enableWrite;
    }

    public Share setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Share setProviderTenantId(Long providerTenantId) {
        this.providerTenantId = providerTenantId;
        return this;
    }
    public Long getProviderTenantId() {
        return this.providerTenantId;
    }

    public Share setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public Share setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public Share setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Share setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}

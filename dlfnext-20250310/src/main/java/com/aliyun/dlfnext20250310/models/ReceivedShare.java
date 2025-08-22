// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ReceivedShare extends TeaModel {
    @NameInMap("catalogName")
    public String catalogName;

    @NameInMap("comment")
    public String comment;

    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("enableWrite")
    public Boolean enableWrite;

    @NameInMap("owner")
    public String owner;

    @NameInMap("providerTenantId")
    public Long providerTenantId;

    @NameInMap("shareId")
    public String shareId;

    @NameInMap("shareName")
    public String shareName;

    @NameInMap("updatedAt")
    public Long updatedAt;

    @NameInMap("updatedBy")
    public String updatedBy;

    public static ReceivedShare build(java.util.Map<String, ?> map) throws Exception {
        ReceivedShare self = new ReceivedShare();
        return TeaModel.build(map, self);
    }

    public ReceivedShare setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ReceivedShare setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ReceivedShare setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ReceivedShare setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ReceivedShare setEnableWrite(Boolean enableWrite) {
        this.enableWrite = enableWrite;
        return this;
    }
    public Boolean getEnableWrite() {
        return this.enableWrite;
    }

    public ReceivedShare setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ReceivedShare setProviderTenantId(Long providerTenantId) {
        this.providerTenantId = providerTenantId;
        return this;
    }
    public Long getProviderTenantId() {
        return this.providerTenantId;
    }

    public ReceivedShare setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public ReceivedShare setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public ReceivedShare setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public ReceivedShare setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}

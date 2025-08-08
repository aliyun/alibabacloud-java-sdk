// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ShareResource extends TeaModel {
    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("databaseName")
    public String databaseName;

    @NameInMap("shareType")
    public String shareType;

    @NameInMap("tableName")
    public String tableName;

    @NameInMap("updatedAt")
    public Long updatedAt;

    @NameInMap("updatedBy")
    public String updatedBy;

    public static ShareResource build(java.util.Map<String, ?> map) throws Exception {
        ShareResource self = new ShareResource();
        return TeaModel.build(map, self);
    }

    public ShareResource setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ShareResource setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ShareResource setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ShareResource setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ShareResource setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ShareResource setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public ShareResource setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}

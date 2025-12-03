// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetShareRelationship extends TeaModel {
    @NameInMap("AllowedMountAccessLevels")
    public java.util.List<String> allowedMountAccessLevels;

    @NameInMap("ExpiresAt")
    public String expiresAt;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("IsSecureMode")
    public Boolean isSecureMode;

    @NameInMap("SharedAt")
    public String sharedAt;

    @NameInMap("SourceTenantId")
    public String sourceTenantId;

    @NameInMap("SourceWorkspaceId")
    public String sourceWorkspaceId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DatasetShareRelationship build(java.util.Map<String, ?> map) throws Exception {
        DatasetShareRelationship self = new DatasetShareRelationship();
        return TeaModel.build(map, self);
    }

    public DatasetShareRelationship setAllowedMountAccessLevels(java.util.List<String> allowedMountAccessLevels) {
        this.allowedMountAccessLevels = allowedMountAccessLevels;
        return this;
    }
    public java.util.List<String> getAllowedMountAccessLevels() {
        return this.allowedMountAccessLevels;
    }

    public DatasetShareRelationship setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public DatasetShareRelationship setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public DatasetShareRelationship setIsSecureMode(Boolean isSecureMode) {
        this.isSecureMode = isSecureMode;
        return this;
    }
    public Boolean getIsSecureMode() {
        return this.isSecureMode;
    }

    public DatasetShareRelationship setSharedAt(String sharedAt) {
        this.sharedAt = sharedAt;
        return this;
    }
    public String getSharedAt() {
        return this.sharedAt;
    }

    public DatasetShareRelationship setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
        return this;
    }
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

    public DatasetShareRelationship setSourceWorkspaceId(String sourceWorkspaceId) {
        this.sourceWorkspaceId = sourceWorkspaceId;
        return this;
    }
    public String getSourceWorkspaceId() {
        return this.sourceWorkspaceId;
    }

    public DatasetShareRelationship setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetShareRelationship setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DatasetShareRelationship setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetShareRelationship extends TeaModel {
    /**
     * <p>The allowed permissions for the shared dataset. When a user accesses the shared dataset, their permissions are limited to this list. The default value is \<code>[&quot;RO&quot;]\\</code>.</p>
     * <ul>
     * <li><p>RO: Read-only permission. The recipient can only read the dataset.</p>
     * </li>
     * <li><p>RW: Read and write permission. The recipient can read and modify the dataset.</p>
     * </li>
     * </ul>
     */
    @NameInMap("AllowedMountAccessLevels")
    public java.util.List<String> allowedMountAccessLevels;

    /**
     * <p>The expiration time. The time is in ISO 8601 format.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the sharing relationship never expires.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T12:23:58Z</p>
     */
    @NameInMap("ExpiresAt")
    public String expiresAt;

    /**
     * <p>Additional configurations for the sharing relationship. This parameter is a JSON string.</p>
     * <ul>
     * <li><p>AllowExportModel: Specifies whether to allow the export of trained models.</p>
     * </li>
     * <li><p>AllowAccessDLCWebTerminal: Specifies whether to allow users to log on to the container in a DLC task.</p>
     * </li>
     * <li><p>AllowAccessDLCFullLog: Specifies whether to allow access to the full task logs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AllowExportModel&quot;:false,&quot;AllowAccessDLCWebTerminal&quot;:false,&quot;AllowAccessDLCFullLog&quot;:false}</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>Specifies whether to enable security protection for the shared dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSecureMode")
    public Boolean isSecureMode;

    /**
     * <p>The time when the dataset was shared. The time is in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-27T12:23:58Z</p>
     */
    @NameInMap("SharedAt")
    public String sharedAt;

    /**
     * <p>The ID of the tenant that owns the source dataset. The user who shares the dataset must be a workspace administrator or the root account.</p>
     * 
     * <strong>example:</strong>
     * <p>148***************115</p>
     */
    @NameInMap("SourceTenantId")
    public String sourceTenantId;

    /**
     * <p>The ID of the workspace that contains the source dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>33**19</p>
     */
    @NameInMap("SourceWorkspaceId")
    public String sourceWorkspaceId;

    /**
     * <p>The status of the sharing relationship.</p>
     * <ul>
     * <li><p>ACTIVE: The sharing relationship is active. Complete dataset information is displayed only in this state.</p>
     * </li>
     * <li><p>EXPIRED: The sharing relationship has expired.</p>
     * </li>
     * <li><p>REVOKED: The sharing relationship was revoked by the sharer.</p>
     * </li>
     * <li><p>INVALID: The sharing relationship is invalid. This can happen if the source dataset is deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the target tenant. This must be a root account ID.</p>
     * <blockquote>
     * <p>This parameter is required when you set a sharing relationship.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>153***************249</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the target workspace. This ID must be different from the source workspace ID.</p>
     * <blockquote>
     * <p>This parameter is required when you set a sharing relationship.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>42**2</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigRequest extends TeaModel {
    /**
     * <p>The status of SQL audit logging. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enables SQL audit logging.</li>
     * <li><strong>off</strong>: Disables SQL audit logging.</li>
     * </ul>
     * <blockquote>
     * <p>After SQL audit logging is disabled, all SQL audit logs are deleted. Query and export the SQL audit logs before disabling SQL audit logging. For more information, see <a href="https://help.aliyun.com/document_detail/612426.html">DescribeAuditLogRecords</a>. When SQL audit logging is enabled again, audit logs are displayed starting from the most recent time that audit logging was enabled.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AuditLogStatus")
    public String auditLogStatus;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> to query the IDs of all clusters in a specified region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-t4nj8619bz2w3****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The type of the compute engine. Valid values:</p>
     * <ul>
     * <li>XIHE (<strong>default</strong>): Xihe compute engine.</li>
     * <li>SPARK: Spark compute engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>XIHE</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> to query the region ID of a specified cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyAuditLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogConfigRequest self = new ModifyAuditLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogConfigRequest setAuditLogStatus(String auditLogStatus) {
        this.auditLogStatus = auditLogStatus;
        return this;
    }
    public String getAuditLogStatus() {
        return this.auditLogStatus;
    }

    public ModifyAuditLogConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAuditLogConfigRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ModifyAuditLogConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAuditLogConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAuditLogConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAuditLogConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAuditLogConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

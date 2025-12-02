// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyMaterializedViewRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database where the materialized view resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myDB</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Enable the refresh delay alert. Valid values:</p>
     * <ul>
     * <li>true: Enables alert.</li>
     * <li>false: Disables alert.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDelayAlert")
    public Boolean enableDelayAlert;

    /**
     * <p>Specifies whether to send alerts when the refresh task fails. Valid values:</p>
     * <ul>
     * <li>true: Send alerts.</li>
     * <li>false: Alerts disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableFailureAlert")
    public Boolean enableFailureAlert;

    /**
     * <p>The name of the resource group to which the materialized view is bound.</p>
     * 
     * <strong>example:</strong>
     * <p>res_1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Refresh delay tolerance (in minutes).</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LatencyTolerance")
    public Integer latencyTolerance;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable query rewrite. Valid values:</p>
     * <ul>
     * <li>true: Enables query rewrite.</li>
     * <li>false: Disables query rewrite.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryWrite")
    public Boolean queryWrite;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the materialized view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mv_1</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static ModifyMaterializedViewRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterializedViewRequest self = new ModifyMaterializedViewRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaterializedViewRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyMaterializedViewRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyMaterializedViewRequest setEnableDelayAlert(Boolean enableDelayAlert) {
        this.enableDelayAlert = enableDelayAlert;
        return this;
    }
    public Boolean getEnableDelayAlert() {
        return this.enableDelayAlert;
    }

    public ModifyMaterializedViewRequest setEnableFailureAlert(Boolean enableFailureAlert) {
        this.enableFailureAlert = enableFailureAlert;
        return this;
    }
    public Boolean getEnableFailureAlert() {
        return this.enableFailureAlert;
    }

    public ModifyMaterializedViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyMaterializedViewRequest setLatencyTolerance(Integer latencyTolerance) {
        this.latencyTolerance = latencyTolerance;
        return this;
    }
    public Integer getLatencyTolerance() {
        return this.latencyTolerance;
    }

    public ModifyMaterializedViewRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyMaterializedViewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMaterializedViewRequest setQueryWrite(Boolean queryWrite) {
        this.queryWrite = queryWrite;
        return this;
    }
    public Boolean getQueryWrite() {
        return this.queryWrite;
    }

    public ModifyMaterializedViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMaterializedViewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMaterializedViewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMaterializedViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyMaterializedViewRecommendRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf6o*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>task desc</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("MinRewriteQueryCount")
    public Integer minRewriteQueryCount;

    @NameInMap("MinRewriteQueryPattern")
    public Integer minRewriteQueryPattern;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScanQueriesRange")
    public Integer scanQueriesRange;

    /**
     * <strong>example:</strong>
     * <p>Monday;Wednesday</p>
     */
    @NameInMap("SchedulingDay")
    public String schedulingDay;

    /**
     * <strong>example:</strong>
     * <p>weekly</p>
     */
    @NameInMap("SchedulingPolicy")
    public String schedulingPolicy;

    @NameInMap("SlowQueryThreshold")
    public Integer slowQueryThreshold;

    /**
     * <strong>example:</strong>
     * <p>10:00:00</p>
     */
    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task_n1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static ModifyMaterializedViewRecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterializedViewRecommendRequest self = new ModifyMaterializedViewRecommendRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaterializedViewRecommendRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyMaterializedViewRecommendRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMaterializedViewRecommendRequest setMinRewriteQueryCount(Integer minRewriteQueryCount) {
        this.minRewriteQueryCount = minRewriteQueryCount;
        return this;
    }
    public Integer getMinRewriteQueryCount() {
        return this.minRewriteQueryCount;
    }

    public ModifyMaterializedViewRecommendRequest setMinRewriteQueryPattern(Integer minRewriteQueryPattern) {
        this.minRewriteQueryPattern = minRewriteQueryPattern;
        return this;
    }
    public Integer getMinRewriteQueryPattern() {
        return this.minRewriteQueryPattern;
    }

    public ModifyMaterializedViewRecommendRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyMaterializedViewRecommendRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMaterializedViewRecommendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMaterializedViewRecommendRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMaterializedViewRecommendRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMaterializedViewRecommendRequest setScanQueriesRange(Integer scanQueriesRange) {
        this.scanQueriesRange = scanQueriesRange;
        return this;
    }
    public Integer getScanQueriesRange() {
        return this.scanQueriesRange;
    }

    public ModifyMaterializedViewRecommendRequest setSchedulingDay(String schedulingDay) {
        this.schedulingDay = schedulingDay;
        return this;
    }
    public String getSchedulingDay() {
        return this.schedulingDay;
    }

    public ModifyMaterializedViewRecommendRequest setSchedulingPolicy(String schedulingPolicy) {
        this.schedulingPolicy = schedulingPolicy;
        return this;
    }
    public String getSchedulingPolicy() {
        return this.schedulingPolicy;
    }

    public ModifyMaterializedViewRecommendRequest setSlowQueryThreshold(Integer slowQueryThreshold) {
        this.slowQueryThreshold = slowQueryThreshold;
        return this;
    }
    public Integer getSlowQueryThreshold() {
        return this.slowQueryThreshold;
    }

    public ModifyMaterializedViewRecommendRequest setSpecifiedTime(String specifiedTime) {
        this.specifiedTime = specifiedTime;
        return this;
    }
    public String getSpecifiedTime() {
        return this.specifiedTime;
    }

    public ModifyMaterializedViewRecommendRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}

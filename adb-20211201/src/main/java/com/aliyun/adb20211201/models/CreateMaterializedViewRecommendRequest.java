// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateMaterializedViewRecommendRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-8vbwm***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the recommendation task.</p>
     * 
     * <strong>example:</strong>
     * <p>task desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Pattern匹配的最少慢查询个数</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinRewriteQueryCount")
    public Integer minRewriteQueryCount;

    /**
     * <p>最小可加速的Pattern数量</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MinRewriteQueryPattern")
    public Integer minRewriteQueryPattern;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
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

    /**
     * <p>The time range for scanning data. Unit: days. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScanQueriesRange")
    public Integer scanQueriesRange;

    /**
     * <p>This parameter is valid only when SchedulingPolicy is set to weekly. Valid values:</p>
     * <ul>
     * <li>Monday</li>
     * <li>Tuesday</li>
     * <li>Wednesday</li>
     * <li>Thursday</li>
     * <li>Friday</li>
     * <li>Saturday</li>
     * <li>Sunday</li>
     * </ul>
     * <p>Separate multiple days with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Monday;Wednesday</p>
     */
    @NameInMap("SchedulingDay")
    public String schedulingDay;

    /**
     * <p>The scheduling policy of the recommendation task. Valid values:</p>
     * <p>daily</p>
     * <p>weekly</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>weekly</p>
     */
    @NameInMap("SchedulingPolicy")
    public String schedulingPolicy;

    /**
     * <p>慢查询阈值</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlowQueryThreshold")
    public Integer slowQueryThreshold;

    /**
     * <p>The execution time of the recommendation task. Specify the time in the HH:MM:SS format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10:00:00</p>
     */
    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    /**
     * <p>The name of the recommendation task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task_n1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateMaterializedViewRecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaterializedViewRecommendRequest self = new CreateMaterializedViewRecommendRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaterializedViewRecommendRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMaterializedViewRecommendRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMaterializedViewRecommendRequest setMinRewriteQueryCount(Integer minRewriteQueryCount) {
        this.minRewriteQueryCount = minRewriteQueryCount;
        return this;
    }
    public Integer getMinRewriteQueryCount() {
        return this.minRewriteQueryCount;
    }

    public CreateMaterializedViewRecommendRequest setMinRewriteQueryPattern(Integer minRewriteQueryPattern) {
        this.minRewriteQueryPattern = minRewriteQueryPattern;
        return this;
    }
    public Integer getMinRewriteQueryPattern() {
        return this.minRewriteQueryPattern;
    }

    public CreateMaterializedViewRecommendRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateMaterializedViewRecommendRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMaterializedViewRecommendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMaterializedViewRecommendRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMaterializedViewRecommendRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMaterializedViewRecommendRequest setScanQueriesRange(Integer scanQueriesRange) {
        this.scanQueriesRange = scanQueriesRange;
        return this;
    }
    public Integer getScanQueriesRange() {
        return this.scanQueriesRange;
    }

    public CreateMaterializedViewRecommendRequest setSchedulingDay(String schedulingDay) {
        this.schedulingDay = schedulingDay;
        return this;
    }
    public String getSchedulingDay() {
        return this.schedulingDay;
    }

    public CreateMaterializedViewRecommendRequest setSchedulingPolicy(String schedulingPolicy) {
        this.schedulingPolicy = schedulingPolicy;
        return this;
    }
    public String getSchedulingPolicy() {
        return this.schedulingPolicy;
    }

    public CreateMaterializedViewRecommendRequest setSlowQueryThreshold(Integer slowQueryThreshold) {
        this.slowQueryThreshold = slowQueryThreshold;
        return this;
    }
    public Integer getSlowQueryThreshold() {
        return this.slowQueryThreshold;
    }

    public CreateMaterializedViewRecommendRequest setSpecifiedTime(String specifiedTime) {
        this.specifiedTime = specifiedTime;
        return this;
    }
    public String getSpecifiedTime() {
        return this.specifiedTime;
    }

    public CreateMaterializedViewRecommendRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}

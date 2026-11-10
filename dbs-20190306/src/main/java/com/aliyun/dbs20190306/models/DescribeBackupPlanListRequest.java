// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanListRequest extends TeaModel {
    /**
     * <p>The backup method.</p>
     * 
     * <strong>example:</strong>
     * <p>logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The ID of the backup plan. You can specify multiple backup plan IDs, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01exXXXX</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The name of the backup plan.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("BackupPlanName")
    public String backupPlanName;

    /**
     * <p>The status of the backup plan. Valid values:</p>
     * <ul>
     * <li><p><strong>wait</strong>: The backup plan is not configured.</p>
     * </li>
     * <li><p><strong>init</strong>: The backup plan is not started because a precheck failed.</p>
     * </li>
     * <li><p><strong>running</strong>: The backup plan is running.</p>
     * </li>
     * <li><p><strong>stop</strong>: The backup plan has failed.</p>
     * </li>
     * <li><p><strong>pause</strong>: The backup plan is paused.</p>
     * </li>
     * <li><p><strong>locked</strong>: The backup plan is locked.</p>
     * </li>
     * <li><p><strong>check_pass</strong>: The precheck is passed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wait</p>
     */
    @NameInMap("BackupPlanStatus")
    public String backupPlanStatus;

    /**
     * <p>A client-generated token that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDASDASDSADASFCZXVZ</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number to return. The value must be an integer that is greater than or equal to 0. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * <blockquote>
     * <p>The default value is <strong>30</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the backup plan is located. You can call the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation to query the list of supported regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzecovzti****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to return information about the backup strategy. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowBackupStrategyInfo")
    public Boolean showBackupStrategyInfo;

    /**
     * <p>Specifies whether to return the recovery time range. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowRecoverTimeRange")
    public Boolean showRecoverTimeRange;

    /**
     * <p>Specifies whether to return information about the storage strategy. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowStorageStrategyInfo")
    public Boolean showStorageStrategyInfo;

    public static DescribeBackupPlanListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanListRequest self = new DescribeBackupPlanListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanListRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public DescribeBackupPlanListRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeBackupPlanListRequest setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    public DescribeBackupPlanListRequest setBackupPlanStatus(String backupPlanStatus) {
        this.backupPlanStatus = backupPlanStatus;
        return this;
    }
    public String getBackupPlanStatus() {
        return this.backupPlanStatus;
    }

    public DescribeBackupPlanListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeBackupPlanListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeBackupPlanListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupPlanListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupPlanListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeBackupPlanListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeBackupPlanListRequest setShowBackupStrategyInfo(Boolean showBackupStrategyInfo) {
        this.showBackupStrategyInfo = showBackupStrategyInfo;
        return this;
    }
    public Boolean getShowBackupStrategyInfo() {
        return this.showBackupStrategyInfo;
    }

    public DescribeBackupPlanListRequest setShowRecoverTimeRange(Boolean showRecoverTimeRange) {
        this.showRecoverTimeRange = showRecoverTimeRange;
        return this;
    }
    public Boolean getShowRecoverTimeRange() {
        return this.showRecoverTimeRange;
    }

    public DescribeBackupPlanListRequest setShowStorageStrategyInfo(Boolean showStorageStrategyInfo) {
        this.showStorageStrategyInfo = showStorageStrategyInfo;
        return this;
    }
    public Boolean getShowStorageStrategyInfo() {
        return this.showStorageStrategyInfo;
    }

}

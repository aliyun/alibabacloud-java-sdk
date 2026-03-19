// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>Backup plan ID. To list multiple backup plans, separate IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01exXXXX</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>Backup plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("BackupPlanName")
    public String backupPlanName;

    /**
     * <p>Backup plan status. Valid values:</p>
     * <ul>
     * <li><p><strong>wait</strong>: Not configured.</p>
     * </li>
     * <li><p><strong>init</strong>: Not started (precheck failed).</p>
     * </li>
     * <li><p><strong>running</strong>: Running.</p>
     * </li>
     * <li><p><strong>stop</strong>: Failed.</p>
     * </li>
     * <li><p><strong>pause</strong>: Paused.</p>
     * </li>
     * <li><p><strong>locked</strong>: Locked.</p>
     * </li>
     * <li><p><strong>check_pass</strong>: Precheck passed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wait</p>
     */
    @NameInMap("BackupPlanStatus")
    public String backupPlanStatus;

    /**
     * <p>A client token used to ensure idempotence and prevent duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDASDASDSADASFCZXVZ</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Page number. Valid values: integers greater than or equal to 0 and less than or equal to the maximum integer value. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of records per page. Valid values: 1 to 100.</p>
     * <blockquote>
     * <p>Default value: <strong>30</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>DBS region. Call <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> to view supported regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzecovzti****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ShowBackupStrategyInfo")
    public Boolean showBackupStrategyInfo;

    @NameInMap("ShowRecoverTimeRange")
    public Boolean showRecoverTimeRange;

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

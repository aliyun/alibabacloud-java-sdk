// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanListRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule. You can query multiple backup schedule IDs. Separate multiple IDs with commas (,).</p>
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
     * <p>Backup plan status, the values are as follows:</p>
     * <ul>
     * <li><strong>wait</strong>: Not configured</li>
     * <li><strong>init</strong>: Not started (pre-check failed)</li>
     * <li><strong>running</strong>: Running</li>
     * <li><strong>stop</strong>: Failed</li>
     * <li><strong>pause</strong>: Paused</li>
     * <li><strong>locked</strong>: Locked</li>
     * <li><strong>check_pass</strong>: Pre-check passed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wait</p>
     */
    @NameInMap("BackupPlanStatus")
    public String backupPlanStatus;

    /**
     * <p>Used to ensure the idempotence of the request, preventing duplicate submissions.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDASDASDSADASFCZXVZ</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Page number, must be greater than or equal to 0 and not exceed the maximum value of Integer. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of records per page, the value should be between 1 and 100.</p>
     * <blockquote>
     * <p>The default is <strong>30</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>DBS region, you can view the supported DBS regions by calling the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> interface.</p>
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

    public static DescribeBackupPlanListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanListRequest self = new DescribeBackupPlanListRequest();
        return TeaModel.build(map, self);
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

}

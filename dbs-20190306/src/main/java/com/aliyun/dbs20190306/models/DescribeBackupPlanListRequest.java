// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanListRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupPlanName")
    public String backupPlanName;

    @NameInMap("BackupPlanStatus")
    public String backupPlanStatus;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Region")
    public String region;

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

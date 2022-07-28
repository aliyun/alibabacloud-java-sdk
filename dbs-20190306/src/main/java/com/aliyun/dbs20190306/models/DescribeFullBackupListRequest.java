// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeFullBackupListRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShowStorageType")
    public Boolean showStorageType;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static DescribeFullBackupListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullBackupListRequest self = new DescribeFullBackupListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFullBackupListRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeFullBackupListRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public DescribeFullBackupListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeFullBackupListRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeFullBackupListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeFullBackupListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeFullBackupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFullBackupListRequest setShowStorageType(Boolean showStorageType) {
        this.showStorageType = showStorageType;
        return this;
    }
    public Boolean getShowStorageType() {
        return this.showStorageType;
    }

    public DescribeFullBackupListRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}

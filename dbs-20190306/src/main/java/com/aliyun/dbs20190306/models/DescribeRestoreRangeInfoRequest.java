// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreRangeInfoRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BeginTimestampForRestore")
    public Long beginTimestampForRestore;

    @NameInMap("EndTimestampForRestore")
    public Long endTimestampForRestore;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RecentlyRestore")
    public Boolean recentlyRestore;

    public static DescribeRestoreRangeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreRangeInfoRequest self = new DescribeRestoreRangeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreRangeInfoRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeRestoreRangeInfoRequest setBeginTimestampForRestore(Long beginTimestampForRestore) {
        this.beginTimestampForRestore = beginTimestampForRestore;
        return this;
    }
    public Long getBeginTimestampForRestore() {
        return this.beginTimestampForRestore;
    }

    public DescribeRestoreRangeInfoRequest setEndTimestampForRestore(Long endTimestampForRestore) {
        this.endTimestampForRestore = endTimestampForRestore;
        return this;
    }
    public Long getEndTimestampForRestore() {
        return this.endTimestampForRestore;
    }

    public DescribeRestoreRangeInfoRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeRestoreRangeInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeRestoreRangeInfoRequest setRecentlyRestore(Boolean recentlyRestore) {
        this.recentlyRestore = recentlyRestore;
        return this;
    }
    public Boolean getRecentlyRestore() {
        return this.recentlyRestore;
    }

}

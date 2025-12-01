// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreRangeInfoRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbssl67c7mx****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The earliest point in time to which you can restore data. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the value of the parameter for each backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1646674092000</p>
     */
    @NameInMap("BeginTimestampForRestore")
    public Long beginTimestampForRestore;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The latest point in time to which you can restore data. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the value of the parameter for each backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1646846814000</p>
     */
    @NameInMap("EndTimestampForRestore")
    public Long endTimestampForRestore;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Specifies whether to query the most recent point in time to which you can restore data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    public DescribeRestoreRangeInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public DescribeRestoreRangeInfoRequest setRecentlyRestore(Boolean recentlyRestore) {
        this.recentlyRestore = recentlyRestore;
        return this;
    }
    public Boolean getRecentlyRestore() {
        return this.recentlyRestore;
    }

}

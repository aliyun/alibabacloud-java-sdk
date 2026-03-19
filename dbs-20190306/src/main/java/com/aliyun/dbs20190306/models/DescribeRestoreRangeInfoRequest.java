// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreRangeInfoRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbssl67c7mx****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The start timestamp of the restorable time range. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1646674092000</p>
     */
    @NameInMap("BeginTimestampForRestore")
    public Long beginTimestampForRestore;

    /**
     * <p>A client token that ensures the idempotence of requests and prevents duplicate submissions.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end timestamp of the restorable time range. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
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
     * <p>Whether to enable recent restore.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>opened</p>
     */
    @NameInMap("BackupStatus")
    public String backupStatus;

    /**
     * <strong>example:</strong>
     * <p>bds-m5e54q06ceyhxxxx</p>
     */
    @NameInMap("BdsClusterId")
    public String bdsClusterId;

    /**
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>F7E71430-A825-470A-B40B-DF3F3AAC9BEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStatusResponseBody self = new DescribeBackupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStatusResponseBody setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public DescribeBackupStatusResponseBody setBdsClusterId(String bdsClusterId) {
        this.bdsClusterId = bdsClusterId;
        return this;
    }
    public String getBdsClusterId() {
        return this.bdsClusterId;
    }

    public DescribeBackupStatusResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

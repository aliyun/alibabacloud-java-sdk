// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupStatusResponseBody extends TeaModel {
    @NameInMap("BackupStatus")
    public String backupStatus;

    @NameInMap("BdsClusterId")
    public String bdsClusterId;

    @NameInMap("ClusterId")
    public String clusterId;

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

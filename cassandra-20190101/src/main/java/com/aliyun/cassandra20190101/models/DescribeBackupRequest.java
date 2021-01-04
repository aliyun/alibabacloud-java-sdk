// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupType")
    public String backupType;

    public static DescribeBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupRequest self = new DescribeBackupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public DescribeBackupRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeBackupRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

}

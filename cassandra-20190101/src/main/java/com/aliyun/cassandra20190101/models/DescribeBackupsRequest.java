// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("BackupType")
    public String backupType;

    public static DescribeBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsRequest self = new DescribeBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupsRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public DescribeBackupsRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

}

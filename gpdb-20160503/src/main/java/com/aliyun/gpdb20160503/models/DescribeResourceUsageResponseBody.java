// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageResponseBody extends TeaModel {
    @NameInMap("BackupSize")
    public Long backupSize;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSize")
    public Long dataSize;

    @NameInMap("DiskUsed")
    public Long diskUsed;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("LogSize")
    public Long logSize;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageResponseBody self = new DescribeResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageResponseBody setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
        return this;
    }
    public Long getBackupSize() {
        return this.backupSize;
    }

    public DescribeResourceUsageResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeResourceUsageResponseBody setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DescribeResourceUsageResponseBody setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }
    public Long getDiskUsed() {
        return this.diskUsed;
    }

    public DescribeResourceUsageResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeResourceUsageResponseBody setLogSize(Long logSize) {
        this.logSize = logSize;
        return this;
    }
    public Long getLogSize() {
        return this.logSize;
    }

    public DescribeResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeCheckUserBackupFileResponseBody extends TeaModel {
    @NameInMap("Status")
    public Boolean status;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeCheckUserBackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckUserBackupFileResponseBody self = new DescribeCheckUserBackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckUserBackupFileResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DescribeCheckUserBackupFileResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeCheckUserBackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckUserBackupFileResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}

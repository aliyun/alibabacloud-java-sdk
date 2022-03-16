// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupsRequest extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndTimeUTC")
    public String endTimeUTC;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StartTimeUTC")
    public String startTimeUTC;

    public static DescribeBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsRequest self = new DescribeBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeBackupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBackupsRequest setEndTimeUTC(String endTimeUTC) {
        this.endTimeUTC = endTimeUTC;
        return this;
    }
    public String getEndTimeUTC() {
        return this.endTimeUTC;
    }

    public DescribeBackupsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeBackupsRequest setStartTimeUTC(String startTimeUTC) {
        this.startTimeUTC = startTimeUTC;
        return this;
    }
    public String getStartTimeUTC() {
        return this.startTimeUTC;
    }

}

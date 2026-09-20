// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupsRequest extends TeaModel {
    /**
     * <p>The ID of the backup to query.</p>
     * 
     * <strong>example:</strong>
     * <p>job-xxxx</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time of the backup query. Format: yyyy-MM-dd HH:mm.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-23 23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The end time of the backup query in UTC. The end time must be later than the start time. Format: yyyy-MM-ddTHH:mmZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-23T15:59:59Z</p>
     */
    @NameInMap("EndTimeUTC")
    public String endTimeUTC;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The start time of the backup query. Format: yyyy-MM-dd HH:mm.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-13 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The start time of the backup query in UTC. Format: yyyy-MM-ddTHH:mmZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-12T16:00:00Z</p>
     */
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

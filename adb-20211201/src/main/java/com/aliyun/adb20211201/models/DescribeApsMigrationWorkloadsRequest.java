// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsMigrationWorkloadsRequest extends TeaModel {
    /**
     * <p>The instance ID. This parameter is required. You can call the DescribeDBClusters operation to query the instance ID in the destination region.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-*******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-20T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The OSS address.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://******</p>
     */
    @NameInMap("OssLocation")
    public String ossLocation;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-20T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the workload.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    public static DescribeApsMigrationWorkloadsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsMigrationWorkloadsRequest self = new DescribeApsMigrationWorkloadsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApsMigrationWorkloadsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApsMigrationWorkloadsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApsMigrationWorkloadsRequest setOssLocation(String ossLocation) {
        this.ossLocation = ossLocation;
        return this;
    }
    public String getOssLocation() {
        return this.ossLocation;
    }

    public DescribeApsMigrationWorkloadsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApsMigrationWorkloadsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApsMigrationWorkloadsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeApsMigrationWorkloadsRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

}

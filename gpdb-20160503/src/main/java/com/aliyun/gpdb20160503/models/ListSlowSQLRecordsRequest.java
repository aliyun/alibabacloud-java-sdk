// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSlowSQLRecordsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z. The time must be in UTC. The end time must be later than the start time.</p>
     * <p>Defaults to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-04T17:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The longest execution duration. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxDuration")
    public String maxDuration;

    /**
     * <p>The minimum execution duration. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinDuration")
    public String minDuration;

    /**
     * <p>Sort criteria (JSON string). {&quot;Field&quot;:&quot;QueryStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}</p>
     * <p>Field: Specifies the field to sort by.</p>
     * <ul>
     * <li>QueryID: Query ID.</li>
     * <li>UserName: The username.</li>
     * <li>DBName: The name of the database.</li>
     * <li>QueryStartTime: The start time.</li>
     * <li>QueryEndTime: The end time.</li>
     * <li>DurationTime: The execution duration of the query.</li>
     * <li>Optimizer.</li>
     * <li>LockWaitTime: The lock waiting time.</li>
     * <li>QueueWaitTime: Time in Queue.</li>
     * <li>CpuTimeMs: CPU time.</li>
     * <li>MemBytes: The memory usage.</li>
     * <li>SpillBytes: Spill File Size.</li>
     * </ul>
     * <p>Type: Sort order.</p>
     * <ul>
     * <li>Desc: descending.</li>
     * <li>Asc: ascending.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Field&quot;:&quot;QueryStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of the page to return. The value must be a positive integer in the range [1, 100]. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The time must be in UTC and formatted as yyyy-MM-ddTHH:mmZ.</p>
     * <p>Defaults to the current time minus 5 minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-04T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The account name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ListSlowSQLRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlowSQLRecordsRequest self = new ListSlowSQLRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListSlowSQLRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListSlowSQLRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public ListSlowSQLRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSlowSQLRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSlowSQLRecordsRequest setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public String getMaxDuration() {
        return this.maxDuration;
    }

    public ListSlowSQLRecordsRequest setMinDuration(String minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public String getMinDuration() {
        return this.minDuration;
    }

    public ListSlowSQLRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSlowSQLRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSlowSQLRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSlowSQLRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSlowSQLRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListSlowSQLRecordsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}

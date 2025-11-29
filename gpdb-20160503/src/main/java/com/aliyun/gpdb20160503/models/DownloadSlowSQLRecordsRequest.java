// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadSlowSQLRecordsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z. The time must be in UTC. The end time must be later than the start time.</p>
     * <p>Defaults to the current time</p>
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
     * <p>Sort criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>{Field: SchemaName, Type: Desc}</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z.</p>
     * <p>Defaults to the current time minus 5 minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-04T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The database account.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DownloadSlowSQLRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSlowSQLRecordsRequest self = new DownloadSlowSQLRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSlowSQLRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DownloadSlowSQLRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DownloadSlowSQLRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadSlowSQLRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DownloadSlowSQLRecordsRequest setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public String getMaxDuration() {
        return this.maxDuration;
    }

    public DownloadSlowSQLRecordsRequest setMinDuration(String minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public String getMinDuration() {
        return this.minDuration;
    }

    public DownloadSlowSQLRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DownloadSlowSQLRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DownloadSlowSQLRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DownloadSlowSQLRecordsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeActiveSQLRecordsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-07T07:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword used to filter queries.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The maxmum amount of time consumed by traces. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxDuration")
    public String maxDuration;

    /**
     * <p>The minimum amount of time consumed by traces. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MinDuration")
    public String minDuration;

    /**
     * <p>The field used to sort lock diagnostics records and the sorting order.</p>
     * <p>Default value: <code>{&quot;Field&quot;:&quot;StartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}</code>, which indicates that lock diagnostics records are sorted by the start time in descending order. No other values are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Field&quot;:&quot;StartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-03T09:30Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeActiveSQLRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveSQLRecordsRequest self = new DescribeActiveSQLRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveSQLRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeActiveSQLRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeActiveSQLRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeActiveSQLRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeActiveSQLRecordsRequest setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public String getMaxDuration() {
        return this.maxDuration;
    }

    public DescribeActiveSQLRecordsRequest setMinDuration(String minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public String getMinDuration() {
        return this.minDuration;
    }

    public DescribeActiveSQLRecordsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeActiveSQLRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeActiveSQLRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}

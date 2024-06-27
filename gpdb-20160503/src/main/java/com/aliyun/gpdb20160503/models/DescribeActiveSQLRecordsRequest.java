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
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <strong>example:</strong>
     * <p>2022-05-07T07:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxDuration")
    public String maxDuration;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MinDuration")
    public String minDuration;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Field&quot;:&quot;StartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}</p>
     */
    @NameInMap("Order")
    public String order;

    /**
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

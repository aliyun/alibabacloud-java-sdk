// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeActiveSQLRecordsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MaxDuration")
    public String maxDuration;

    @NameInMap("MinDuration")
    public String minDuration;

    @NameInMap("Order")
    public String order;

    @NameInMap("StartTime")
    public String startTime;

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

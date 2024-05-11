// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceErrorLogRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC. The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is not supported in Alibaba Cloud public cloud.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>One or more keywords that are used to query error logs.</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>The level of the logs to query. Valid values:</p>
     * <br>
     * <p>*   **ALL**: queries all error logs.</p>
     * <p>*   **PANIC**: queries only abnormal logs.</p>
     * <p>*   **FATAL**: queries only critical logs.</p>
     * <p>*   **ERROR**: queries only error logs.</p>
     */
    @NameInMap("LogLevel")
    public String logLevel;

    /**
     * <p>The page number. Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <br>
     * <p>*   **20**</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     * <br>
     * <p>Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The username.</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeDBInstanceErrorLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceErrorLogRequest self = new DescribeDBInstanceErrorLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceErrorLogRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceErrorLogRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDBInstanceErrorLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstanceErrorLogRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeDBInstanceErrorLogRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public DescribeDBInstanceErrorLogRequest setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public DescribeDBInstanceErrorLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceErrorLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstanceErrorLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBInstanceErrorLogRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC. The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter condition on queries. Specify the value in the JSON format. Valid values:</p>
     * <br>
     * <p>*   `{"Type":"maxCost", "Value":"100"}`: filters the top 100 queries that are the most time-consuming.</p>
     * <br>
     * <p>*   `{"Type":"status","Value":"finished"}`: filters completed queries.</p>
     * <br>
     * <p>*   `{"Type":"status","Value":"running"}`: filters running queries.</p>
     * <br>
     * <p>*   `{"Type":"cost","Min":"30","Max":"50"}`: filters the queries that consume 30 milliseconds or more and less than 50 milliseconds. You can customize a filter condition by setting **Min** and **Max**.</p>
     * <br>
     * <p>    *   If only **Min** is specified, the queries that consume a period of time that is greater than or equal to the Min value are filtered.</p>
     * <p>    *   If only **Max** is specified, the queries that consume a period of time that is less than the Max value are filtered.</p>
     * <p>    *   If both **Min** and **Max** are specified, the queries that consume a period of time that is greater than or equal to the **Min** value and less than the **Max** value are filtered.</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The beginning of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the database account.</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeDiagnosisMonitorPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisMonitorPerformanceRequest self = new DescribeDiagnosisMonitorPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisMonitorPerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adbtest</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC. The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-07T07:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter condition on queries. Specify the value in the JSON format. Valid values:</p>
     * <ul>
     * <li><p><code>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</code>: filters the top 100 queries that are the most time-consuming.</p>
     * </li>
     * <li><p><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: filters completed queries.</p>
     * </li>
     * <li><p><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>: filters running queries.</p>
     * </li>
     * <li><p><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;30&quot;,&quot;Max&quot;:&quot;50&quot;}</code>: filters the queries that consume 30 milliseconds or more and less than 50 milliseconds. You can customize a filter condition by setting <strong>Min</strong> and <strong>Max</strong>.</p>
     * <ul>
     * <li>If only <strong>Min</strong> is specified, the queries that consume a period of time that is greater than or equal to the Min value are filtered.</li>
     * <li>If only <strong>Max</strong> is specified, the queries that consume a period of time that is less than the Max value are filtered.</li>
     * <li>If both <strong>Min</strong> and <strong>Max</strong> are specified, the queries that consume a period of time that is greater than or equal to the <strong>Min</strong> value and less than the <strong>Max</strong> value are filtered.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-07T06:59Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>adbpguser</p>
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

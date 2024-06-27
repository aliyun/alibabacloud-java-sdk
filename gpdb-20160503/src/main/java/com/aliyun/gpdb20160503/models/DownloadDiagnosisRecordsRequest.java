// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsRequest extends TeaModel {
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
     * <p>The end of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-07T07:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the file that contains the query diagnostic information. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: simplified Chinese</li>
     * <li><strong>en</strong>: English</li>
     * <li><strong>ja</strong>: Japanese</li>
     * <li><strong>zh-tw</strong>: traditional Chinese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The filter condition on queries. The value is in the JSON format. Valid values:</p>
     * <ul>
     * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</code>: filters the top 100 queries that are the most time-consuming.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: filters completed queries.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>: filters running queries.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: filters the queries that consume less than 200 milliseconds.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;200&quot;,&quot;Max&quot;:&quot;60000&quot;}</code>: filters the queries that consume 200 milliseconds or more and less than 1 minute.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;60000&quot;}</code>: filters the queries that consume 1 minute or more.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;30&quot;,&quot;Max&quot;:&quot;50&quot;}</code>: filters the queries that consume 30 milliseconds or more and less than 50 milliseconds. You can customize a filter condition by setting <strong>Min</strong> and <strong>Max</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot; }</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The ID of the resource group to which the instance belongs. For more information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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

    public static DownloadDiagnosisRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDiagnosisRecordsRequest self = new DownloadDiagnosisRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDiagnosisRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DownloadDiagnosisRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DownloadDiagnosisRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadDiagnosisRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadDiagnosisRecordsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DownloadDiagnosisRecordsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DownloadDiagnosisRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DownloadDiagnosisRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsRequest extends TeaModel {
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
     * <p>The end of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the file that contains the query diagnostic information. Valid values:</p>
     * <br>
     * <p>*   **zh**: simplified Chinese</p>
     * <p>*   **en**: English</p>
     * <p>*   **ja**: Japanese</p>
     * <p>*   **zh-tw**: traditional Chinese</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The filter condition on queries. The value is in the JSON format. Valid values:</p>
     * <br>
     * <p>*   `{"Type":"maxCost", "Value":"100"}`: filters the top 100 queries that are the most time-consuming.</p>
     * <p>*   `{"Type":"status","Value":"finished"}`: filters completed queries.</p>
     * <p>*   `{"Type":"status","Value":"running"}`: filters running queries.</p>
     * <p>*   `{"Type":"cost","Max":"200"}`: filters the queries that consume less than 200 milliseconds.</p>
     * <p>*   `{"Type":"cost","Min":"200","Max":"60000"}`: filters the queries that consume 200 milliseconds or more and less than 1 minute.</p>
     * <p>*   `{"Type":"cost","Min":"60000"}`: filters the queries that consume 1 minute or more.</p>
     * <p>*   `{"Type":"cost","Min":"30","Max":"50"}`: filters the queries that consume 30 milliseconds or more and less than 50 milliseconds. You can customize a filter condition by setting **Min** and **Max**.</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The ID of the resource group to which the instance belongs. For more information about how to obtain the ID of a resource group, see [View basic information of a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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

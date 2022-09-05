// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Database")
    public String database;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("QueryCondition")
    public String queryCondition;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    public String startTime;

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

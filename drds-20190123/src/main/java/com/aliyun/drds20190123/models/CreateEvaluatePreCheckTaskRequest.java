// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluatePreCheckTaskRequest extends TeaModel {
    @NameInMap("AvgQpsGrowthScale")
    public Integer avgQpsGrowthScale;

    @NameInMap("DataGrowthScale")
    public Integer dataGrowthScale;

    @NameInMap("DbInfo")
    public java.util.List<CreateEvaluatePreCheckTaskRequestDbInfo> dbInfo;

    @NameInMap("EvaluateHours")
    public Integer evaluateHours;

    @NameInMap("TaskName")
    public String taskName;

    public static CreateEvaluatePreCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatePreCheckTaskRequest self = new CreateEvaluatePreCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatePreCheckTaskRequest setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
        this.avgQpsGrowthScale = avgQpsGrowthScale;
        return this;
    }
    public Integer getAvgQpsGrowthScale() {
        return this.avgQpsGrowthScale;
    }

    public CreateEvaluatePreCheckTaskRequest setDataGrowthScale(Integer dataGrowthScale) {
        this.dataGrowthScale = dataGrowthScale;
        return this;
    }
    public Integer getDataGrowthScale() {
        return this.dataGrowthScale;
    }

    public CreateEvaluatePreCheckTaskRequest setDbInfo(java.util.List<CreateEvaluatePreCheckTaskRequestDbInfo> dbInfo) {
        this.dbInfo = dbInfo;
        return this;
    }
    public java.util.List<CreateEvaluatePreCheckTaskRequestDbInfo> getDbInfo() {
        return this.dbInfo;
    }

    public CreateEvaluatePreCheckTaskRequest setEvaluateHours(Integer evaluateHours) {
        this.evaluateHours = evaluateHours;
        return this;
    }
    public Integer getEvaluateHours() {
        return this.evaluateHours;
    }

    public CreateEvaluatePreCheckTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class CreateEvaluatePreCheckTaskRequestDbInfo extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbPassword")
        public String dbPassword;

        @NameInMap("DbPort")
        public String dbPort;

        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("InstId")
        public String instId;

        public static CreateEvaluatePreCheckTaskRequestDbInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateEvaluatePreCheckTaskRequestDbInfo self = new CreateEvaluatePreCheckTaskRequestDbInfo();
            return TeaModel.build(map, self);
        }

        public CreateEvaluatePreCheckTaskRequestDbInfo setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateEvaluatePreCheckTaskRequestDbInfo setDbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }
        public String getDbPassword() {
            return this.dbPassword;
        }

        public CreateEvaluatePreCheckTaskRequestDbInfo setDbPort(String dbPort) {
            this.dbPort = dbPort;
            return this;
        }
        public String getDbPort() {
            return this.dbPort;
        }

        public CreateEvaluatePreCheckTaskRequestDbInfo setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public CreateEvaluatePreCheckTaskRequestDbInfo setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

    }

}

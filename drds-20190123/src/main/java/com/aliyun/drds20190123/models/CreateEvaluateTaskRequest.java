// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateTaskRequest extends TeaModel {
    @NameInMap("AvgQpsGrowthScale")
    public Integer avgQpsGrowthScale;

    @NameInMap("DataGrowthScale")
    public Integer dataGrowthScale;

    @NameInMap("DbInfo")
    public java.util.List<CreateEvaluateTaskRequestDbInfo> dbInfo;

    @NameInMap("EvaluateHours")
    public Integer evaluateHours;

    @NameInMap("TaskName")
    public String taskName;

    public static CreateEvaluateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateTaskRequest self = new CreateEvaluateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateTaskRequest setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
        this.avgQpsGrowthScale = avgQpsGrowthScale;
        return this;
    }
    public Integer getAvgQpsGrowthScale() {
        return this.avgQpsGrowthScale;
    }

    public CreateEvaluateTaskRequest setDataGrowthScale(Integer dataGrowthScale) {
        this.dataGrowthScale = dataGrowthScale;
        return this;
    }
    public Integer getDataGrowthScale() {
        return this.dataGrowthScale;
    }

    public CreateEvaluateTaskRequest setDbInfo(java.util.List<CreateEvaluateTaskRequestDbInfo> dbInfo) {
        this.dbInfo = dbInfo;
        return this;
    }
    public java.util.List<CreateEvaluateTaskRequestDbInfo> getDbInfo() {
        return this.dbInfo;
    }

    public CreateEvaluateTaskRequest setEvaluateHours(Integer evaluateHours) {
        this.evaluateHours = evaluateHours;
        return this;
    }
    public Integer getEvaluateHours() {
        return this.evaluateHours;
    }

    public CreateEvaluateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class CreateEvaluateTaskRequestDbInfo extends TeaModel {
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

        public static CreateEvaluateTaskRequestDbInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateEvaluateTaskRequestDbInfo self = new CreateEvaluateTaskRequestDbInfo();
            return TeaModel.build(map, self);
        }

        public CreateEvaluateTaskRequestDbInfo setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateEvaluateTaskRequestDbInfo setDbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }
        public String getDbPassword() {
            return this.dbPassword;
        }

        public CreateEvaluateTaskRequestDbInfo setDbPort(String dbPort) {
            this.dbPort = dbPort;
            return this;
        }
        public String getDbPort() {
            return this.dbPort;
        }

        public CreateEvaluateTaskRequestDbInfo setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public CreateEvaluateTaskRequestDbInfo setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

    }

}

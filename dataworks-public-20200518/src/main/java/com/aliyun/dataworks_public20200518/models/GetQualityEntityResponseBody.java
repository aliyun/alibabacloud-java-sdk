// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public java.util.List<GetQualityEntityResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualityEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityEntityResponseBody self = new GetQualityEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityEntityResponseBody setData(java.util.List<GetQualityEntityResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityEntityResponseBodyData> getData() {
        return this.data;
    }

    public GetQualityEntityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityEntityResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQualityEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityEntityResponseBodyData extends TeaModel {
        @NameInMap("RelativeNode")
        public String relativeNode;

        @NameInMap("Task")
        public Integer task;

        @NameInMap("OnDutyAccountName")
        public String onDutyAccountName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("OnDuty")
        public String onDuty;

        @NameInMap("Followers")
        public String followers;

        @NameInMap("MatchExpression")
        public String matchExpression;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("HasRelativeNode")
        public Boolean hasRelativeNode;

        @NameInMap("EntityLevel")
        public Integer entityLevel;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Sql")
        public Integer sql;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        public static GetQualityEntityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityEntityResponseBodyData self = new GetQualityEntityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityEntityResponseBodyData setRelativeNode(String relativeNode) {
            this.relativeNode = relativeNode;
            return this;
        }
        public String getRelativeNode() {
            return this.relativeNode;
        }

        public GetQualityEntityResponseBodyData setTask(Integer task) {
            this.task = task;
            return this;
        }
        public Integer getTask() {
            return this.task;
        }

        public GetQualityEntityResponseBodyData setOnDutyAccountName(String onDutyAccountName) {
            this.onDutyAccountName = onDutyAccountName;
            return this;
        }
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        public GetQualityEntityResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetQualityEntityResponseBodyData setOnDuty(String onDuty) {
            this.onDuty = onDuty;
            return this;
        }
        public String getOnDuty() {
            return this.onDuty;
        }

        public GetQualityEntityResponseBodyData setFollowers(String followers) {
            this.followers = followers;
            return this;
        }
        public String getFollowers() {
            return this.followers;
        }

        public GetQualityEntityResponseBodyData setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public GetQualityEntityResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQualityEntityResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityEntityResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetQualityEntityResponseBodyData setHasRelativeNode(Boolean hasRelativeNode) {
            this.hasRelativeNode = hasRelativeNode;
            return this;
        }
        public Boolean getHasRelativeNode() {
            return this.hasRelativeNode;
        }

        public GetQualityEntityResponseBodyData setEntityLevel(Integer entityLevel) {
            this.entityLevel = entityLevel;
            return this;
        }
        public Integer getEntityLevel() {
            return this.entityLevel;
        }

        public GetQualityEntityResponseBodyData setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetQualityEntityResponseBodyData setSql(Integer sql) {
            this.sql = sql;
            return this;
        }
        public Integer getSql() {
            return this.sql;
        }

        public GetQualityEntityResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityEntityResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityFollowerResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<GetQualityFollowerResponseData> data;

    public static GetQualityFollowerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityFollowerResponse self = new GetQualityFollowerResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityFollowerResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityFollowerResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityFollowerResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQualityFollowerResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityFollowerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityFollowerResponse setData(java.util.List<GetQualityFollowerResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityFollowerResponseData> getData() {
        return this.data;
    }

    public static class GetQualityFollowerResponseData extends TeaModel {
        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("Follower")
        @Validation(required = true)
        public String follower;

        @NameInMap("AlarmMode")
        @Validation(required = true)
        public Integer alarmMode;

        @NameInMap("FollowerAccountName")
        @Validation(required = true)
        public String followerAccountName;

        public static GetQualityFollowerResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityFollowerResponseData self = new GetQualityFollowerResponseData();
            return TeaModel.build(map, self);
        }

        public GetQualityFollowerResponseData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityFollowerResponseData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetQualityFollowerResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityFollowerResponseData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetQualityFollowerResponseData setFollower(String follower) {
            this.follower = follower;
            return this;
        }
        public String getFollower() {
            return this.follower;
        }

        public GetQualityFollowerResponseData setAlarmMode(Integer alarmMode) {
            this.alarmMode = alarmMode;
            return this;
        }
        public Integer getAlarmMode() {
            return this.alarmMode;
        }

        public GetQualityFollowerResponseData setFollowerAccountName(String followerAccountName) {
            this.followerAccountName = followerAccountName;
            return this;
        }
        public String getFollowerAccountName() {
            return this.followerAccountName;
        }

    }

}

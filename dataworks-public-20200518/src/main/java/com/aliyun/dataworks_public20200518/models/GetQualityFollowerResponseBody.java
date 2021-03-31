// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityFollowerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public java.util.List<GetQualityFollowerResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualityFollowerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityFollowerResponseBody self = new GetQualityFollowerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityFollowerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityFollowerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityFollowerResponseBody setData(java.util.List<GetQualityFollowerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityFollowerResponseBodyData> getData() {
        return this.data;
    }

    public GetQualityFollowerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityFollowerResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQualityFollowerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityFollowerResponseBodyData extends TeaModel {
        @NameInMap("FollowerAccountName")
        public String followerAccountName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("AlarmMode")
        public Integer alarmMode;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Follower")
        public String follower;

        public static GetQualityFollowerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityFollowerResponseBodyData self = new GetQualityFollowerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityFollowerResponseBodyData setFollowerAccountName(String followerAccountName) {
            this.followerAccountName = followerAccountName;
            return this;
        }
        public String getFollowerAccountName() {
            return this.followerAccountName;
        }

        public GetQualityFollowerResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetQualityFollowerResponseBodyData setAlarmMode(Integer alarmMode) {
            this.alarmMode = alarmMode;
            return this;
        }
        public Integer getAlarmMode() {
            return this.alarmMode;
        }

        public GetQualityFollowerResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetQualityFollowerResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityFollowerResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityFollowerResponseBodyData setFollower(String follower) {
            this.follower = follower;
            return this;
        }
        public String getFollower() {
            return this.follower;
        }

    }

}

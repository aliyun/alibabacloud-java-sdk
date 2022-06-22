// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppListSentinelAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAppListSentinelAppsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAppListSentinelAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppListSentinelAppsResponseBody self = new QueryAppListSentinelAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppListSentinelAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppListSentinelAppsResponseBody setData(java.util.List<QueryAppListSentinelAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAppListSentinelAppsResponseBodyData> getData() {
        return this.data;
    }

    public QueryAppListSentinelAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppListSentinelAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppListSentinelAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAppListSentinelAppsResponseBodyData extends TeaModel {
        @NameInMap("AhasAppName")
        public String ahasAppName;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public Integer appType;

        @NameInMap("CurrentLevel")
        public Integer currentLevel;

        @NameInMap("DirtyLevel")
        public Integer dirtyLevel;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("LastHealthPingTime")
        public Long lastHealthPingTime;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("UserId")
        public String userId;

        public static QueryAppListSentinelAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppListSentinelAppsResponseBodyData self = new QueryAppListSentinelAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppListSentinelAppsResponseBodyData setAhasAppName(String ahasAppName) {
            this.ahasAppName = ahasAppName;
            return this;
        }
        public String getAhasAppName() {
            return this.ahasAppName;
        }

        public QueryAppListSentinelAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAppListSentinelAppsResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public QueryAppListSentinelAppsResponseBodyData setCurrentLevel(Integer currentLevel) {
            this.currentLevel = currentLevel;
            return this;
        }
        public Integer getCurrentLevel() {
            return this.currentLevel;
        }

        public QueryAppListSentinelAppsResponseBodyData setDirtyLevel(Integer dirtyLevel) {
            this.dirtyLevel = dirtyLevel;
            return this;
        }
        public Integer getDirtyLevel() {
            return this.dirtyLevel;
        }

        public QueryAppListSentinelAppsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAppListSentinelAppsResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public QueryAppListSentinelAppsResponseBodyData setLastHealthPingTime(Long lastHealthPingTime) {
            this.lastHealthPingTime = lastHealthPingTime;
            return this;
        }
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        public QueryAppListSentinelAppsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryAppListSentinelAppsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

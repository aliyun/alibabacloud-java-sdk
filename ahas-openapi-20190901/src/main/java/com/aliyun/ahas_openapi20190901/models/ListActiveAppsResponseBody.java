// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListActiveAppsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListActiveAppsResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListActiveAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActiveAppsResponseBody self = new ListActiveAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActiveAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListActiveAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActiveAppsResponseBody setData(java.util.List<ListActiveAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListActiveAppsResponseBodyData> getData() {
        return this.data;
    }

    public ListActiveAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListActiveAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListActiveAppsResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("LastHealthPingTime")
        public Long lastHealthPingTime;

        @NameInMap("CurrentLevel")
        public Integer currentLevel;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("AppType")
        public Integer appType;

        @NameInMap("DirtyLevel")
        public Integer dirtyLevel;

        @NameInMap("AhasAppName")
        public String ahasAppName;

        public static ListActiveAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListActiveAppsResponseBodyData self = new ListActiveAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListActiveAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListActiveAppsResponseBodyData setLastHealthPingTime(Long lastHealthPingTime) {
            this.lastHealthPingTime = lastHealthPingTime;
            return this;
        }
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        public ListActiveAppsResponseBodyData setCurrentLevel(Integer currentLevel) {
            this.currentLevel = currentLevel;
            return this;
        }
        public Integer getCurrentLevel() {
            return this.currentLevel;
        }

        public ListActiveAppsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListActiveAppsResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public ListActiveAppsResponseBodyData setDirtyLevel(Integer dirtyLevel) {
            this.dirtyLevel = dirtyLevel;
            return this;
        }
        public Integer getDirtyLevel() {
            return this.dirtyLevel;
        }

        public ListActiveAppsResponseBodyData setAhasAppName(String ahasAppName) {
            this.ahasAppName = ahasAppName;
            return this;
        }
        public String getAhasAppName() {
            return this.ahasAppName;
        }

    }

}

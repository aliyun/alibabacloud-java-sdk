// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelQueryAppPriceLevelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelQueryAppPriceLevelResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelQueryAppPriceLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelQueryAppPriceLevelResponseBody self = new SentinelQueryAppPriceLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelQueryAppPriceLevelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelQueryAppPriceLevelResponseBody setData(SentinelQueryAppPriceLevelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelQueryAppPriceLevelResponseBodyData getData() {
        return this.data;
    }

    public SentinelQueryAppPriceLevelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelQueryAppPriceLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelQueryAppPriceLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelQueryAppPriceLevelResponseBodyData extends TeaModel {
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

        @NameInMap("LastHealthPingTime")
        public Long lastHealthPingTime;

        @NameInMap("LevelModifyTime")
        public Long levelModifyTime;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("UserId")
        public String userId;

        public static SentinelQueryAppPriceLevelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelQueryAppPriceLevelResponseBodyData self = new SentinelQueryAppPriceLevelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelQueryAppPriceLevelResponseBodyData setAhasAppName(String ahasAppName) {
            this.ahasAppName = ahasAppName;
            return this;
        }
        public String getAhasAppName() {
            return this.ahasAppName;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setCurrentLevel(Integer currentLevel) {
            this.currentLevel = currentLevel;
            return this;
        }
        public Integer getCurrentLevel() {
            return this.currentLevel;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setDirtyLevel(Integer dirtyLevel) {
            this.dirtyLevel = dirtyLevel;
            return this;
        }
        public Integer getDirtyLevel() {
            return this.dirtyLevel;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setLastHealthPingTime(Long lastHealthPingTime) {
            this.lastHealthPingTime = lastHealthPingTime;
            return this;
        }
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setLevelModifyTime(Long levelModifyTime) {
            this.levelModifyTime = levelModifyTime;
            return this;
        }
        public Long getLevelModifyTime() {
            return this.levelModifyTime;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelQueryAppPriceLevelResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelModifyAppPriceLevelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelModifyAppPriceLevelResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelModifyAppPriceLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelModifyAppPriceLevelResponseBody self = new SentinelModifyAppPriceLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelModifyAppPriceLevelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelModifyAppPriceLevelResponseBody setData(SentinelModifyAppPriceLevelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelModifyAppPriceLevelResponseBodyData getData() {
        return this.data;
    }

    public SentinelModifyAppPriceLevelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelModifyAppPriceLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelModifyAppPriceLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelModifyAppPriceLevelResponseBodyData extends TeaModel {
        @NameInMap("ahasAppName")
        public String ahasAppName;

        @NameInMap("appName")
        public String appName;

        @NameInMap("appType")
        public Integer appType;

        @NameInMap("currentLevel")
        public Integer currentLevel;

        @NameInMap("dirtyLevel")
        public Integer dirtyLevel;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastHealthPingTime")
        public Long lastHealthPingTime;

        @NameInMap("levelModifyTime")
        public Long levelModifyTime;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("userId")
        public String userId;

        public static SentinelModifyAppPriceLevelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelModifyAppPriceLevelResponseBodyData self = new SentinelModifyAppPriceLevelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelModifyAppPriceLevelResponseBodyData setAhasAppName(String ahasAppName) {
            this.ahasAppName = ahasAppName;
            return this;
        }
        public String getAhasAppName() {
            return this.ahasAppName;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setCurrentLevel(Integer currentLevel) {
            this.currentLevel = currentLevel;
            return this;
        }
        public Integer getCurrentLevel() {
            return this.currentLevel;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setDirtyLevel(Integer dirtyLevel) {
            this.dirtyLevel = dirtyLevel;
            return this;
        }
        public Integer getDirtyLevel() {
            return this.dirtyLevel;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setLastHealthPingTime(Long lastHealthPingTime) {
            this.lastHealthPingTime = lastHealthPingTime;
            return this;
        }
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setLevelModifyTime(Long levelModifyTime) {
            this.levelModifyTime = levelModifyTime;
            return this;
        }
        public Long getLevelModifyTime() {
            return this.levelModifyTime;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelModifyAppPriceLevelResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

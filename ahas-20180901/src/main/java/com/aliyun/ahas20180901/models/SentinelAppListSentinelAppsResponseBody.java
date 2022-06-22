// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppListSentinelAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelAppListSentinelAppsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppListSentinelAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppListSentinelAppsResponseBody self = new SentinelAppListSentinelAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppListSentinelAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppListSentinelAppsResponseBody setData(java.util.List<SentinelAppListSentinelAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelAppListSentinelAppsResponseBodyData> getData() {
        return this.data;
    }

    public SentinelAppListSentinelAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppListSentinelAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppListSentinelAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppListSentinelAppsResponseBodyData extends TeaModel {
        @NameInMap("ahasAppName")
        public String ahasAppName;

        @NameInMap("appName")
        public String appName;

        @NameInMap("appType")
        public Integer appType;

        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastHealthPingTime")
        public Long lastHealthPingTime;

        @NameInMap("modifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("userId")
        public String userId;

        public static SentinelAppListSentinelAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppListSentinelAppsResponseBodyData self = new SentinelAppListSentinelAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppListSentinelAppsResponseBodyData setAhasAppName(String ahasAppName) {
            this.ahasAppName = ahasAppName;
            return this;
        }
        public String getAhasAppName() {
            return this.ahasAppName;
        }

        public SentinelAppListSentinelAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelAppListSentinelAppsResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public SentinelAppListSentinelAppsResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelAppListSentinelAppsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelAppListSentinelAppsResponseBodyData setLastHealthPingTime(Long lastHealthPingTime) {
            this.lastHealthPingTime = lastHealthPingTime;
            return this;
        }
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        public SentinelAppListSentinelAppsResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelAppListSentinelAppsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelAppListSentinelAppsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

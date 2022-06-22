// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelListAppsOfTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelListAppsOfTypesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelListAppsOfTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelListAppsOfTypesResponseBody self = new SentinelListAppsOfTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelListAppsOfTypesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelListAppsOfTypesResponseBody setData(java.util.List<SentinelListAppsOfTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelListAppsOfTypesResponseBodyData> getData() {
        return this.data;
    }

    public SentinelListAppsOfTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelListAppsOfTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelListAppsOfTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelListAppsOfTypesResponseBodyData extends TeaModel {
        @NameInMap("ahasAppName")
        public String ahasAppName;

        @NameInMap("appName")
        public String appName;

        @NameInMap("appType")
        public Integer appType;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastHealthPingTime")
        public Long lastHealthPingTime;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("userId")
        public String userId;

        public static SentinelListAppsOfTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelListAppsOfTypesResponseBodyData self = new SentinelListAppsOfTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelListAppsOfTypesResponseBodyData setAhasAppName(String ahasAppName) {
            this.ahasAppName = ahasAppName;
            return this;
        }
        public String getAhasAppName() {
            return this.ahasAppName;
        }

        public SentinelListAppsOfTypesResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelListAppsOfTypesResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public SentinelListAppsOfTypesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelListAppsOfTypesResponseBodyData setLastHealthPingTime(Long lastHealthPingTime) {
            this.lastHealthPingTime = lastHealthPingTime;
            return this;
        }
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        public SentinelListAppsOfTypesResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelListAppsOfTypesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

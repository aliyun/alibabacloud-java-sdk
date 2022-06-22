// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetAdapterSettingOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGetAdapterSettingOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGetAdapterSettingOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetAdapterSettingOfAppResponseBody self = new SentinelGetAdapterSettingOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGetAdapterSettingOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGetAdapterSettingOfAppResponseBody setData(SentinelGetAdapterSettingOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGetAdapterSettingOfAppResponseBodyData getData() {
        return this.data;
    }

    public SentinelGetAdapterSettingOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGetAdapterSettingOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGetAdapterSettingOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGetAdapterSettingOfAppResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WebFallbackMode")
        public Integer webFallbackMode;

        @NameInMap("WebRedirectUrl")
        public String webRedirectUrl;

        @NameInMap("WebRespContentType")
        public Integer webRespContentType;

        @NameInMap("WebRespMessage")
        public String webRespMessage;

        @NameInMap("WebRespStatusCode")
        public Integer webRespStatusCode;

        @NameInMap("WebUrlPrefixCleanItems")
        public String webUrlPrefixCleanItems;

        public static SentinelGetAdapterSettingOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetAdapterSettingOfAppResponseBodyData self = new SentinelGetAdapterSettingOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setWebFallbackMode(Integer webFallbackMode) {
            this.webFallbackMode = webFallbackMode;
            return this;
        }
        public Integer getWebFallbackMode() {
            return this.webFallbackMode;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setWebRedirectUrl(String webRedirectUrl) {
            this.webRedirectUrl = webRedirectUrl;
            return this;
        }
        public String getWebRedirectUrl() {
            return this.webRedirectUrl;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setWebRespContentType(Integer webRespContentType) {
            this.webRespContentType = webRespContentType;
            return this;
        }
        public Integer getWebRespContentType() {
            return this.webRespContentType;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setWebRespMessage(String webRespMessage) {
            this.webRespMessage = webRespMessage;
            return this;
        }
        public String getWebRespMessage() {
            return this.webRespMessage;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setWebRespStatusCode(Integer webRespStatusCode) {
            this.webRespStatusCode = webRespStatusCode;
            return this;
        }
        public Integer getWebRespStatusCode() {
            return this.webRespStatusCode;
        }

        public SentinelGetAdapterSettingOfAppResponseBodyData setWebUrlPrefixCleanItems(String webUrlPrefixCleanItems) {
            this.webUrlPrefixCleanItems = webUrlPrefixCleanItems;
            return this;
        }
        public String getWebUrlPrefixCleanItems() {
            return this.webUrlPrefixCleanItems;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelUpdateAdapterSettingOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelUpdateAdapterSettingOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelUpdateAdapterSettingOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelUpdateAdapterSettingOfAppResponseBody self = new SentinelUpdateAdapterSettingOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelUpdateAdapterSettingOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelUpdateAdapterSettingOfAppResponseBody setData(SentinelUpdateAdapterSettingOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelUpdateAdapterSettingOfAppResponseBodyData getData() {
        return this.data;
    }

    public SentinelUpdateAdapterSettingOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelUpdateAdapterSettingOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelUpdateAdapterSettingOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelUpdateAdapterSettingOfAppResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("id")
        public Long id;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("userId")
        public String userId;

        @NameInMap("webFallbackMode")
        public Integer webFallbackMode;

        @NameInMap("webRedirectUrl")
        public String webRedirectUrl;

        @NameInMap("webRespContentType")
        public Integer webRespContentType;

        @NameInMap("webRespMessage")
        public String webRespMessage;

        @NameInMap("webRespStatusCode")
        public Integer webRespStatusCode;

        @NameInMap("webUrlPrefixCleanItems")
        public String webUrlPrefixCleanItems;

        public static SentinelUpdateAdapterSettingOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelUpdateAdapterSettingOfAppResponseBodyData self = new SentinelUpdateAdapterSettingOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setWebFallbackMode(Integer webFallbackMode) {
            this.webFallbackMode = webFallbackMode;
            return this;
        }
        public Integer getWebFallbackMode() {
            return this.webFallbackMode;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setWebRedirectUrl(String webRedirectUrl) {
            this.webRedirectUrl = webRedirectUrl;
            return this;
        }
        public String getWebRedirectUrl() {
            return this.webRedirectUrl;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setWebRespContentType(Integer webRespContentType) {
            this.webRespContentType = webRespContentType;
            return this;
        }
        public Integer getWebRespContentType() {
            return this.webRespContentType;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setWebRespMessage(String webRespMessage) {
            this.webRespMessage = webRespMessage;
            return this;
        }
        public String getWebRespMessage() {
            return this.webRespMessage;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setWebRespStatusCode(Integer webRespStatusCode) {
            this.webRespStatusCode = webRespStatusCode;
            return this;
        }
        public Integer getWebRespStatusCode() {
            return this.webRespStatusCode;
        }

        public SentinelUpdateAdapterSettingOfAppResponseBodyData setWebUrlPrefixCleanItems(String webUrlPrefixCleanItems) {
            this.webUrlPrefixCleanItems = webUrlPrefixCleanItems;
            return this;
        }
        public String getWebUrlPrefixCleanItems() {
            return this.webUrlPrefixCleanItems;
        }

    }

}

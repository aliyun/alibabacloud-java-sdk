// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestUserSellPointTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public RequestUserSellPointTemplateResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RequestUserSellPointTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestUserSellPointTemplateResponseBody self = new RequestUserSellPointTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestUserSellPointTemplateResponseBody setData(RequestUserSellPointTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestUserSellPointTemplateResponseBodyData getData() {
        return this.data;
    }

    public RequestUserSellPointTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestUserSellPointTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestUserSellPointTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestUserSellPointTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestUserSellPointTemplateResponseBodyData extends TeaModel {
        @NameInMap("DisplayConfig")
        public java.util.Map<String, ?> displayConfig;

        @NameInMap("TemplateConfig")
        public java.util.Map<String, ?> templateConfig;

        @NameInMap("TemplateUuid")
        public String templateUuid;

        @NameInMap("Url")
        public String url;

        public static RequestUserSellPointTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestUserSellPointTemplateResponseBodyData self = new RequestUserSellPointTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestUserSellPointTemplateResponseBodyData setDisplayConfig(java.util.Map<String, ?> displayConfig) {
            this.displayConfig = displayConfig;
            return this;
        }
        public java.util.Map<String, ?> getDisplayConfig() {
            return this.displayConfig;
        }

        public RequestUserSellPointTemplateResponseBodyData setTemplateConfig(java.util.Map<String, ?> templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public java.util.Map<String, ?> getTemplateConfig() {
            return this.templateConfig;
        }

        public RequestUserSellPointTemplateResponseBodyData setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public RequestUserSellPointTemplateResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

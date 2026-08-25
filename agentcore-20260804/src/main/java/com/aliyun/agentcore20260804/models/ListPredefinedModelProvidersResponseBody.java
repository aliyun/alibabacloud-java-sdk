// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPredefinedModelProvidersResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListPredefinedModelProvidersResponseBodyData> data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListPredefinedModelProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedModelProvidersResponseBody self = new ListPredefinedModelProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPredefinedModelProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPredefinedModelProvidersResponseBody setData(java.util.List<ListPredefinedModelProvidersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPredefinedModelProvidersResponseBodyData> getData() {
        return this.data;
    }

    public ListPredefinedModelProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPredefinedModelProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPredefinedModelProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPredefinedModelProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPredefinedModelProvidersResponseBodyData extends TeaModel {
        @NameInMap("defaultEndpoint")
        public String defaultEndpoint;

        @NameInMap("defaultProtocol")
        public String defaultProtocol;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("providerType")
        public String providerType;

        public static ListPredefinedModelProvidersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedModelProvidersResponseBodyData self = new ListPredefinedModelProvidersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPredefinedModelProvidersResponseBodyData setDefaultEndpoint(String defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public String getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public ListPredefinedModelProvidersResponseBodyData setDefaultProtocol(String defaultProtocol) {
            this.defaultProtocol = defaultProtocol;
            return this;
        }
        public String getDefaultProtocol() {
            return this.defaultProtocol;
        }

        public ListPredefinedModelProvidersResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPredefinedModelProvidersResponseBodyData setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

    }

}

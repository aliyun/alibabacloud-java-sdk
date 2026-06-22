// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatFlowTemplateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetChatFlowTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetChatFlowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatFlowTemplateResponseBody self = new GetChatFlowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatFlowTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetChatFlowTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatFlowTemplateResponseBody setData(GetChatFlowTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChatFlowTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetChatFlowTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatFlowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChatFlowTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetChatFlowTemplateResponseBodyData extends TeaModel {
        @NameInMap("Response")
        public java.util.Map<String, ?> response;

        public static GetChatFlowTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatFlowTemplateResponseBodyData self = new GetChatFlowTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatFlowTemplateResponseBodyData setResponse(java.util.Map<String, ?> response) {
            this.response = response;
            return this;
        }
        public java.util.Map<String, ?> getResponse() {
            return this.response;
        }

    }

}

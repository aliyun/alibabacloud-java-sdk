// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatFlowTemplateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListChatFlowTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListChatFlowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatFlowTemplateResponseBody self = new ListChatFlowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatFlowTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListChatFlowTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatFlowTemplateResponseBody setData(ListChatFlowTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChatFlowTemplateResponseBodyData getData() {
        return this.data;
    }

    public ListChatFlowTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatFlowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatFlowTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChatFlowTemplateResponseBodyData extends TeaModel {
        @NameInMap("Response")
        public java.util.Map<String, ?> response;

        public static ListChatFlowTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChatFlowTemplateResponseBodyData self = new ListChatFlowTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChatFlowTemplateResponseBodyData setResponse(java.util.Map<String, ?> response) {
            this.response = response;
            return this;
        }
        public java.util.Map<String, ?> getResponse() {
            return this.response;
        }

    }

}

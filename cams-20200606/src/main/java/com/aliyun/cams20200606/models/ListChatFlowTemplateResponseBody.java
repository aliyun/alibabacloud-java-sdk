// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatFlowTemplateResponseBody extends TeaModel {
    /**
     * <p>Access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data object.</p>
     */
    @NameInMap("Data")
    public ListChatFlowTemplateResponseBodyData data;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Values: true: success; false: failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Content of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
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

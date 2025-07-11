// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatFlowTemplateResponseBody extends TeaModel {
    /**
     * <p>Access denied details, this field is returned only when RAM verification fails.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>System returned error code. For more details on error codes, please refer to the error code documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public GetChatFlowTemplateResponseBodyData data;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request ID.</p>
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
        /**
         * <p>Content of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
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

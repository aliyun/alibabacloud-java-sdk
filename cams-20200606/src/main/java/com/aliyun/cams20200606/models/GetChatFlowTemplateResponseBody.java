// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatFlowTemplateResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetChatFlowTemplateResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The operation was successful.</p>
     * </li>
     * <li><p>false: The operation failed.</p>
     * </li>
     * </ul>
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
         * <p>The content of the returned data.</p>
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

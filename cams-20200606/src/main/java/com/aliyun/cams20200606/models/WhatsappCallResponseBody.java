// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class WhatsappCallResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>OK: The request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Model")
    public WhatsappCallResponseBodyModel model;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xik-x**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WhatsappCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WhatsappCallResponseBody self = new WhatsappCallResponseBody();
        return TeaModel.build(map, self);
    }

    public WhatsappCallResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public WhatsappCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WhatsappCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WhatsappCallResponseBody setModel(WhatsappCallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public WhatsappCallResponseBodyModel getModel() {
        return this.model;
    }

    public WhatsappCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WhatsappCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WhatsappCallResponseBodyModel extends TeaModel {
        /**
         * <p>The unique identifier for each call.</p>
         * 
         * <strong>example:</strong>
         * <p>wamid-xx**</p>
         */
        @NameInMap("CallId")
        public String callId;

        public static WhatsappCallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            WhatsappCallResponseBodyModel self = new WhatsappCallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public WhatsappCallResponseBodyModel setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ChangeSignatureQualificationResponseBody extends TeaModel {
    /**
     * <p>Details of the access denial. This field is returned only if RAM authentication fails.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p>A value of <code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see the error code list in this topic or the <a href="https://help.aliyun.com/document_detail/101346.html">API Error Codes</a> topic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data structure.</p>
     */
    @NameInMap("Data")
    public ChangeSignatureQualificationResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud generates this unique identifier to help you troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0A974B78-02BF-4C79-ADF3-90CFBA1B55B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChangeSignatureQualificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeSignatureQualificationResponseBody self = new ChangeSignatureQualificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeSignatureQualificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ChangeSignatureQualificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeSignatureQualificationResponseBody setData(ChangeSignatureQualificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeSignatureQualificationResponseBodyData getData() {
        return this.data;
    }

    public ChangeSignatureQualificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeSignatureQualificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeSignatureQualificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeSignatureQualificationResponseBodyData extends TeaModel {
        /**
         * <p>This field is not used. You can ignore it.</p>
         */
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <p>The status code of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ChangeSignatureQualificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeSignatureQualificationResponseBodyData self = new ChangeSignatureQualificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeSignatureQualificationResponseBodyData setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public ChangeSignatureQualificationResponseBodyData setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public ChangeSignatureQualificationResponseBodyData setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public ChangeSignatureQualificationResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}

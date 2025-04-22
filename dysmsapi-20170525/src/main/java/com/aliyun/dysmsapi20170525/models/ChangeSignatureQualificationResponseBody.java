// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ChangeSignatureQualificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ChangeSignatureQualificationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0A974B78-02BF-4C79-ADF3-90CFBA1B55B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
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

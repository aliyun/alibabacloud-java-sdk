// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetCertificateAttributeResponseBody extends TeaModel {
    @NameInMap("CertificateAttributeDto")
    public GetCertificateAttributeResponseBodyCertificateAttributeDto certificateAttributeDto;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCertificateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateAttributeResponseBody self = new GetCertificateAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateAttributeResponseBody setCertificateAttributeDto(GetCertificateAttributeResponseBodyCertificateAttributeDto certificateAttributeDto) {
        this.certificateAttributeDto = certificateAttributeDto;
        return this;
    }
    public GetCertificateAttributeResponseBodyCertificateAttributeDto getCertificateAttributeDto() {
        return this.certificateAttributeDto;
    }

    public GetCertificateAttributeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCertificateAttributeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCertificateAttributeResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCertificateAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCertificateAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCertificateAttributeResponseBodyCertificateAttributeDto extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableSSL")
        public Boolean enableSSL;

        /**
         * <strong>example:</strong>
         * <p>1790583135000</p>
         */
        @NameInMap("expirationTime")
        public Long expirationTime;

        /**
         * <strong>example:</strong>
         * <p>effective</p>
         */
        @NameInMap("status")
        public String status;

        public static GetCertificateAttributeResponseBodyCertificateAttributeDto build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateAttributeResponseBodyCertificateAttributeDto self = new GetCertificateAttributeResponseBodyCertificateAttributeDto();
            return TeaModel.build(map, self);
        }

        public GetCertificateAttributeResponseBodyCertificateAttributeDto setEnableSSL(Boolean enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }
        public Boolean getEnableSSL() {
            return this.enableSSL;
        }

        public GetCertificateAttributeResponseBodyCertificateAttributeDto setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public GetCertificateAttributeResponseBodyCertificateAttributeDto setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

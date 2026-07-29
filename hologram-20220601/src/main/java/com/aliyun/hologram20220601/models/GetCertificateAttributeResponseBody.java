// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetCertificateAttributeResponseBody extends TeaModel {
    /**
     * <p>The certificate attributes.</p>
     */
    @NameInMap("CertificateAttributeDto")
    public GetCertificateAttributeResponseBodyCertificateAttributeDto certificateAttributeDto;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the request.</p>
     * 
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
         * <p>Specifies whether SSL is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableSSL")
        public Boolean enableSSL;

        /**
         * <p>The UNIX timestamp when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1790583135000</p>
         */
        @NameInMap("expirationTime")
        public Long expirationTime;

        /**
         * <p>The status of the certificate.</p>
         * 
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

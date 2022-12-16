// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSSLCertResponseBody extends TeaModel {
    // The status code returned. A value of 200 indicates that the request is successful.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public java.util.List<ListSSLCertResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned if the request fails.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static ListSSLCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSSLCertResponseBody self = new ListSSLCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSSLCertResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSSLCertResponseBody setData(java.util.List<ListSSLCertResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSSLCertResponseBodyData> getData() {
        return this.data;
    }

    public ListSSLCertResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSSLCertResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSSLCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSSLCertResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSSLCertResponseBodyData extends TeaModel {
        // The effective time of the certificate.
        @NameInMap("AfterDate")
        public String afterDate;

        // The algorithm of the certificate.
        @NameInMap("Algorithm")
        public String algorithm;

        // The expiration time of the certificate.
        @NameInMap("BeforeDate")
        public String beforeDate;

        // The ID of the certificate.
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        // The name of the certificate.
        @NameInMap("CertName")
        public String certName;

        // The domain name with which the certificate is associated.
        @NameInMap("CommonName")
        public String commonName;

        // The effective time of the certificate.
        @NameInMap("GmtAfter")
        public String gmtAfter;

        // The expiration time of the certificate.
        @NameInMap("GmtBefore")
        public String gmtBefore;

        // The issuer of the certificate.
        @NameInMap("Issuer")
        public String issuer;

        // The SSL certificate.
        @NameInMap("Sans")
        public String sans;

        public static ListSSLCertResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSSLCertResponseBodyData self = new ListSSLCertResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSSLCertResponseBodyData setAfterDate(String afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public String getAfterDate() {
            return this.afterDate;
        }

        public ListSSLCertResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListSSLCertResponseBodyData setBeforeDate(String beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public String getBeforeDate() {
            return this.beforeDate;
        }

        public ListSSLCertResponseBodyData setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public ListSSLCertResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public ListSSLCertResponseBodyData setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListSSLCertResponseBodyData setGmtAfter(String gmtAfter) {
            this.gmtAfter = gmtAfter;
            return this;
        }
        public String getGmtAfter() {
            return this.gmtAfter;
        }

        public ListSSLCertResponseBodyData setGmtBefore(String gmtBefore) {
            this.gmtBefore = gmtBefore;
            return this;
        }
        public String getGmtBefore() {
            return this.gmtBefore;
        }

        public ListSSLCertResponseBodyData setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListSSLCertResponseBodyData setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

    }

}

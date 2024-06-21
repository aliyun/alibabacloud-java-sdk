// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSSLCertResponseBody extends TeaModel {
    /**
     * <p>The status code returned. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSSLCertResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CAA9A229-141D-5FBA-AC5C-516C02026A11</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The time when the certificate expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("AfterDate")
        public String afterDate;

        /**
         * <p>The algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The time when the certificate took effect. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2031-03-30 02:35:12</p>
         */
        @NameInMap("BeforeDate")
        public String beforeDate;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The domain name with which the certificate is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>*.test.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The time when the certificate expires. This value is a GMT timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("GmtAfter")
        public String gmtAfter;

        /**
         * <p>The time when the certificate took effect. This value is a GMT timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2031-03-30 02:35:12</p>
         */
        @NameInMap("GmtBefore")
        public String gmtBefore;

        /**
         * <p>The issuer of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SSL</p>
         */
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

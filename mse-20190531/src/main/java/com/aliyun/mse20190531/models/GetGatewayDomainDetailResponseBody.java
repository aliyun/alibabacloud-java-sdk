// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetGatewayDomainDetailResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
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
     * <p>88B83302-CD88-54D3-8DF2-208BFDC73F0D</p>
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

    public static GetGatewayDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayDomainDetailResponseBody self = new GetGatewayDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayDomainDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayDomainDetailResponseBody setData(GetGatewayDomainDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayDomainDetailResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayDomainDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayDomainDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayDomainDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayDomainDetailResponseBodyData extends TeaModel {
        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>234-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The public domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-7ea3da97b96543e19f6c597cd4a9****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("GmtAfter")
        public String gmtAfter;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("GmtBefore")
        public String gmtBefore;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether <code>HTTP/2</code> is enabled.</p>
         * <ul>
         * <li><code>open</code>: <code>HTTP/2</code> is enabled.</li>
         * <li><code>close</code>: <code>HTTP/2</code> is disabled.</li>
         * <li><code>globalConfig</code>: Global configurations are used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        @NameInMap("Http2")
        public String http2;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>Istio</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>Indicates whether HTTPS is forcibly used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MustHttps")
        public Boolean mustHttps;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The protocol of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The name of the extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The maximum version of Transport Layer Security (TLS).</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.3</p>
         */
        @NameInMap("TlsMax")
        public String tlsMax;

        /**
         * <p>The minimum version of TLS.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.0</p>
         */
        @NameInMap("TlsMin")
        public String tlsMin;

        public static GetGatewayDomainDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayDomainDetailResponseBodyData self = new GetGatewayDomainDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayDomainDetailResponseBodyData setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public GetGatewayDomainDetailResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public GetGatewayDomainDetailResponseBodyData setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public GetGatewayDomainDetailResponseBodyData setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public GetGatewayDomainDetailResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public GetGatewayDomainDetailResponseBodyData setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public GetGatewayDomainDetailResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayDomainDetailResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtAfter(String gmtAfter) {
            this.gmtAfter = gmtAfter;
            return this;
        }
        public String getGmtAfter() {
            return this.gmtAfter;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtBefore(String gmtBefore) {
            this.gmtBefore = gmtBefore;
            return this;
        }
        public String getGmtBefore() {
            return this.gmtBefore;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayDomainDetailResponseBodyData setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public GetGatewayDomainDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayDomainDetailResponseBodyData setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetGatewayDomainDetailResponseBodyData setMustHttps(Boolean mustHttps) {
            this.mustHttps = mustHttps;
            return this;
        }
        public Boolean getMustHttps() {
            return this.mustHttps;
        }

        public GetGatewayDomainDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayDomainDetailResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetGatewayDomainDetailResponseBodyData setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public GetGatewayDomainDetailResponseBodyData setTlsMax(String tlsMax) {
            this.tlsMax = tlsMax;
            return this;
        }
        public String getTlsMax() {
            return this.tlsMax;
        }

        public GetGatewayDomainDetailResponseBodyData setTlsMin(String tlsMin) {
            this.tlsMin = tlsMin;
            return this;
        }
        public String getTlsMin() {
            return this.tlsMin;
        }

    }

}

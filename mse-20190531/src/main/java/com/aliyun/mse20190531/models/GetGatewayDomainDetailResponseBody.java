// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayDomainDetailResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public GetGatewayDomainDetailResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
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
        // The start time.
        @NameInMap("AfterDate")
        public Long afterDate;

        // The algorithm.
        @NameInMap("Algorithm")
        public String algorithm;

        // The expiration time.
        @NameInMap("BeforeDate")
        public Long beforeDate;

        // The ID of the certificate.
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        // The name of the certificate.
        @NameInMap("CertName")
        public String certName;

        // The public domain name.
        @NameInMap("CommonName")
        public String commonName;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The start time.
        @NameInMap("GmtAfter")
        public String gmtAfter;

        // The expiration time.
        @NameInMap("GmtBefore")
        public String gmtBefore;

        // The creation time.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The update time.
        @NameInMap("GmtModified")
        public String gmtModified;

        // Indicates whether `HTTP/2` is enabled.
        // 
        // *   `open`: `HTTP/2` is enabled.
        // *   `close`: `HTTP/2` is disabled.
        // *   `globalConfig`: Global configurations are used.
        @NameInMap("Http2")
        public String http2;

        // ID.
        @NameInMap("Id")
        public Long id;

        // The issuer.
        @NameInMap("Issuer")
        public String issuer;

        // Indicates whether HTTPS is forcibly used.
        @NameInMap("MustHttps")
        public Boolean mustHttps;

        // The domain name.
        @NameInMap("Name")
        public String name;

        // The protocol of the gateway.
        @NameInMap("Protocol")
        public String protocol;

        // The name of the extended field.
        @NameInMap("Sans")
        public String sans;

        // The maximum version of Transport Layer Security (TLS).
        @NameInMap("TlsMax")
        public String tlsMax;

        // The minimum version of TLS.
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

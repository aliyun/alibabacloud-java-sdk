// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDomainResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public GetDomainResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID, used for tracing the API call chain.</p>
     * 
     * <strong>example:</strong>
     * <p>3ACFC7A7-45A9-58CF-B2D5-765B60254695</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainResponseBody self = new GetDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDomainResponseBody setData(GetDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDomainResponseBodyData getData() {
        return this.data;
    }

    public GetDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDomainResponseBodyDataStatisticsInfo extends TeaModel {
        @NameInMap("resourceStatistics")
        public java.util.List<ResourceStatistic> resourceStatistics;

        @NameInMap("totalCount")
        public String totalCount;

        public static GetDomainResponseBodyDataStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDomainResponseBodyDataStatisticsInfo self = new GetDomainResponseBodyDataStatisticsInfo();
            return TeaModel.build(map, self);
        }

        public GetDomainResponseBodyDataStatisticsInfo setResourceStatistics(java.util.List<ResourceStatistic> resourceStatistics) {
            this.resourceStatistics = resourceStatistics;
            return this;
        }
        public java.util.List<ResourceStatistic> getResourceStatistics() {
            return this.resourceStatistics;
        }

        public GetDomainResponseBodyDataStatisticsInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetDomainResponseBodyData extends TeaModel {
        /**
         * <p>Encryption algorithm name</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Cloud Shield CA certificate identity.</p>
         * 
         * <strong>example:</strong>
         * <p>223576-cn-hangzhou</p>
         */
        @NameInMap("caCertIndentifier")
        public String caCertIndentifier;

        /**
         * <p>Cloud Shield certificate identity.</p>
         * 
         * <strong>example:</strong>
         * <p>123576-cn-hangzhou</p>
         */
        @NameInMap("certIndentifier")
        public String certIndentifier;

        /**
         * <p>Certificate name</p>
         * 
         * <strong>example:</strong>
         * <p>test-cert</p>
         */
        @NameInMap("certName")
        public String certName;

        /**
         * <p>Where it was created from.</p>
         * 
         * <strong>example:</strong>
         * <p>Console</p>
         */
        @NameInMap("createFrom")
        public String createFrom;

        /**
         * <p>Creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>Whether it is the default domain.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("default")
        public Boolean _default;

        /**
         * <p>Domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cq1m3utlhtgvgkv7sitg</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>Setting for HTTPS protocol type, whether to enable forced HTTPS redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("forceHttps")
        public Boolean forceHttps;

        /**
         * <p>HTTP/2 setting.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("http2Option")
        public String http2Option;

        /**
         * <p>Certificate issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.com</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Certificate expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("notAfterTimstamp")
        public Long notAfterTimstamp;

        /**
         * <p>Certificate effective time.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("notBeforeTimestamp")
        public Long notBeforeTimestamp;

        /**
         * <p>The protocol types supported by the domain.</p>
         * <ul>
         * <li>HTTP: Supports only HTTP protocol.</li>
         * <li>HTTPS: Supports only HTTPS protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>All domain names bound to the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("sans")
        public String sans;

        @NameInMap("statisticsInfo")
        public GetDomainResponseBodyDataStatisticsInfo statisticsInfo;

        /**
         * <p>Maximum TLS protocol version, supports up to TLS 1.3.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.3</p>
         */
        @NameInMap("tlsMax")
        public String tlsMax;

        /**
         * <p>Minimum TLS protocol version, supports down to TLS 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.0</p>
         */
        @NameInMap("tlsMin")
        public String tlsMin;

        /**
         * <p>Update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updatetimestamp")
        public Long updatetimestamp;

        public static GetDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainResponseBodyData self = new GetDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDomainResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public GetDomainResponseBodyData setCaCertIndentifier(String caCertIndentifier) {
            this.caCertIndentifier = caCertIndentifier;
            return this;
        }
        public String getCaCertIndentifier() {
            return this.caCertIndentifier;
        }

        public GetDomainResponseBodyData setCertIndentifier(String certIndentifier) {
            this.certIndentifier = certIndentifier;
            return this;
        }
        public String getCertIndentifier() {
            return this.certIndentifier;
        }

        public GetDomainResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public GetDomainResponseBodyData setCreateFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }
        public String getCreateFrom() {
            return this.createFrom;
        }

        public GetDomainResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetDomainResponseBodyData set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public GetDomainResponseBodyData setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public GetDomainResponseBodyData setForceHttps(Boolean forceHttps) {
            this.forceHttps = forceHttps;
            return this;
        }
        public Boolean getForceHttps() {
            return this.forceHttps;
        }

        public GetDomainResponseBodyData setHttp2Option(String http2Option) {
            this.http2Option = http2Option;
            return this;
        }
        public String getHttp2Option() {
            return this.http2Option;
        }

        public GetDomainResponseBodyData setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetDomainResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDomainResponseBodyData setNotAfterTimstamp(Long notAfterTimstamp) {
            this.notAfterTimstamp = notAfterTimstamp;
            return this;
        }
        public Long getNotAfterTimstamp() {
            return this.notAfterTimstamp;
        }

        public GetDomainResponseBodyData setNotBeforeTimestamp(Long notBeforeTimestamp) {
            this.notBeforeTimestamp = notBeforeTimestamp;
            return this;
        }
        public Long getNotBeforeTimestamp() {
            return this.notBeforeTimestamp;
        }

        public GetDomainResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetDomainResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetDomainResponseBodyData setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public GetDomainResponseBodyData setStatisticsInfo(GetDomainResponseBodyDataStatisticsInfo statisticsInfo) {
            this.statisticsInfo = statisticsInfo;
            return this;
        }
        public GetDomainResponseBodyDataStatisticsInfo getStatisticsInfo() {
            return this.statisticsInfo;
        }

        public GetDomainResponseBodyData setTlsMax(String tlsMax) {
            this.tlsMax = tlsMax;
            return this;
        }
        public String getTlsMax() {
            return this.tlsMax;
        }

        public GetDomainResponseBodyData setTlsMin(String tlsMin) {
            this.tlsMin = tlsMin;
            return this;
        }
        public String getTlsMin() {
            return this.tlsMin;
        }

        public GetDomainResponseBodyData setUpdatetimestamp(Long updatetimestamp) {
            this.updatetimestamp = updatetimestamp;
            return this;
        }
        public Long getUpdatetimestamp() {
            return this.updatetimestamp;
        }

    }

}

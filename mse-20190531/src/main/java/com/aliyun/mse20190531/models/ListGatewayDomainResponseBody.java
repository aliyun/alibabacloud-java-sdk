// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayDomainResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The node data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListGatewayDomainResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3F5D8E93-CA66-57F1-8BCF-A223E11B6B91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayDomainResponseBody self = new ListGatewayDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayDomainResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayDomainResponseBody setData(java.util.List<ListGatewayDomainResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGatewayDomainResponseBodyData> getData() {
        return this.data;
    }

    public ListGatewayDomainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayDomainResponseBodyDataComment extends TeaModel {
        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Error</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListGatewayDomainResponseBodyDataComment build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayDomainResponseBodyDataComment self = new ListGatewayDomainResponseBodyDataComment();
            return TeaModel.build(map, self);
        }

        public ListGatewayDomainResponseBodyDataComment setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig extends TeaModel {
        /**
         * <p>The TLS encrypt cipher suite configuration type. DEFAULT indicates the default configurations, and CUSTOM indicates a custom configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The list of TLS cipher suite names.</p>
         */
        @NameInMap("TlsCipherSuites")
        public java.util.List<String> tlsCipherSuites;

        public static ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig self = new ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig();
            return TeaModel.build(map, self);
        }

        public ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig setTlsCipherSuites(java.util.List<String> tlsCipherSuites) {
            this.tlsCipherSuites = tlsCipherSuites;
            return this;
        }
        public java.util.List<String> getTlsCipherSuites() {
            return this.tlsCipherSuites;
        }

    }

    public static class ListGatewayDomainResponseBodyData extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> The expiration time of the certificate. Go to the domain name details page to view the information.</p>
         * 
         * <strong>example:</strong>
         * <p>2031-03-30 02:35:12</p>
         */
        @NameInMap("CertBeforeDate")
        public String certBeforeDate;

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3452-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The route remark (Ingress).</p>
         */
        @NameInMap("Comment")
        public ListGatewayDomainResponseBodyDataComment comment;

        /**
         * <p>Indicates whether WAF protection is enabled for the domain name.</p>
         */
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The time when the domain name record was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2031-03-30 02:35:12</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the domain name record was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2031-03-30 02:35:12</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
         * <ul>
         * <li><code>open</code>: HTTP/2 is enabled.</li>
         * <li><code>close</code>: HTTP/2 is disabled.</li>
         * <li><code>globalConfig</code>: The global configuration is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        @NameInMap("Http2")
        public String http2;

        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>243</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the domain name is managed.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        /**
         * <p>Indicates whether HTTPS is forced.</p>
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
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The domain name status. Valid values:</p>
         * <ul>
         * <li>0: unpublished</li>
         * <li>2: publishing</li>
         * <li>3: published</li>
         * <li>4: editing</li>
         * <li>5: taking offline</li>
         * <li>6: unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether the gateway supports WAF protection.</p>
         */
        @NameInMap("SupportWaf")
        public Boolean supportWaf;

        /**
         * <p>The TLS cipher suite configuration, including the configuration type and the list of cipher suite names.</p>
         */
        @NameInMap("TlsCipherSuitesConfig")
        public ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig tlsCipherSuitesConfig;

        /**
         * <p>The maximum TLS version.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.3</p>
         */
        @NameInMap("TlsMax")
        public String tlsMax;

        /**
         * <p>The minimum TLS version.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.0</p>
         */
        @NameInMap("TlsMin")
        public String tlsMin;

        /**
         * <p>The source type of the domain name. Valid values:</p>
         * <ul>
         * <li>Op: created in the console</li>
         * <li>Ingress: created by MSE Ingress</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Op</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayDomainResponseBodyData self = new ListGatewayDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayDomainResponseBodyData setCertBeforeDate(String certBeforeDate) {
            this.certBeforeDate = certBeforeDate;
            return this;
        }
        public String getCertBeforeDate() {
            return this.certBeforeDate;
        }

        public ListGatewayDomainResponseBodyData setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public ListGatewayDomainResponseBodyData setComment(ListGatewayDomainResponseBodyDataComment comment) {
            this.comment = comment;
            return this;
        }
        public ListGatewayDomainResponseBodyDataComment getComment() {
            return this.comment;
        }

        public ListGatewayDomainResponseBodyData setEnableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        public ListGatewayDomainResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayDomainResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayDomainResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayDomainResponseBodyData setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public ListGatewayDomainResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayDomainResponseBodyData setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public ListGatewayDomainResponseBodyData setMustHttps(Boolean mustHttps) {
            this.mustHttps = mustHttps;
            return this;
        }
        public Boolean getMustHttps() {
            return this.mustHttps;
        }

        public ListGatewayDomainResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayDomainResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListGatewayDomainResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGatewayDomainResponseBodyData setSupportWaf(Boolean supportWaf) {
            this.supportWaf = supportWaf;
            return this;
        }
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

        public ListGatewayDomainResponseBodyData setTlsCipherSuitesConfig(ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig tlsCipherSuitesConfig) {
            this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
            return this;
        }
        public ListGatewayDomainResponseBodyDataTlsCipherSuitesConfig getTlsCipherSuitesConfig() {
            return this.tlsCipherSuitesConfig;
        }

        public ListGatewayDomainResponseBodyData setTlsMax(String tlsMax) {
            this.tlsMax = tlsMax;
            return this;
        }
        public String getTlsMax() {
            return this.tlsMax;
        }

        public ListGatewayDomainResponseBodyData setTlsMin(String tlsMin) {
            this.tlsMin = tlsMin;
            return this;
        }
        public String getTlsMin() {
            return this.tlsMin;
        }

        public ListGatewayDomainResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

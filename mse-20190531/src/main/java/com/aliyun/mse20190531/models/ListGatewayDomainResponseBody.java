// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayDomainResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The data of the node.
    @NameInMap("Data")
    public java.util.List<ListGatewayDomainResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned.
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
        // The status.
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

    public static class ListGatewayDomainResponseBodyData extends TeaModel {
        // The expiration time.
        @NameInMap("CertBeforeDate")
        public String certBeforeDate;

        // The ID of the certificate.
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        // The route comment (ingress).
        @NameInMap("Comment")
        public ListGatewayDomainResponseBodyDataComment comment;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

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

        // ID
        @NameInMap("Id")
        public Long id;

        // Indicates whether HTTPS is forcefully used.
        @NameInMap("MustHttps")
        public Boolean mustHttps;

        // The domain name.
        @NameInMap("Name")
        public String name;

        // The protocol.
        @NameInMap("Protocol")
        public String protocol;

        // The status of the domain name. Valid values:
        // 
        // *   0: unpublish
        // *   2: publishing
        // *   3: published
        // *   4: editing
        // *   5: unpublishing
        // *   6: unavailable
        @NameInMap("Status")
        public Integer status;

        // The maximum version of Transport Layer Security (TLS).
        @NameInMap("TlsMax")
        public String tlsMax;

        // The minimum version of TLS.
        @NameInMap("TlsMin")
        public String tlsMin;

        // The type.
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

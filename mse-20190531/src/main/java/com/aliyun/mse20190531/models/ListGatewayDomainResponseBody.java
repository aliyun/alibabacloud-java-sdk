// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayDomainResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListGatewayDomainResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CertBeforeDate")
        public String certBeforeDate;

        @NameInMap("CertIdentifier")
        public String certIdentifier;

        @NameInMap("Comment")
        public ListGatewayDomainResponseBodyDataComment comment;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Http2")
        public String http2;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MustHttps")
        public Boolean mustHttps;

        @NameInMap("Name")
        public String name;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TlsMax")
        public String tlsMax;

        @NameInMap("TlsMin")
        public String tlsMin;

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

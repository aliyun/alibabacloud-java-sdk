// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayDomainResponseBody extends TeaModel {
    // The error message returned if the request fails.
    @NameInMap("Code")
    public Integer code;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Data")
    public DeleteGatewayDomainResponseBodyData data;

    // The ID of the request.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The HTTP status code returned.
    @NameInMap("Message")
    public String message;

    // The data structure.
    @NameInMap("RequestId")
    public String requestId;

    // The status code returned.
    @NameInMap("Success")
    public Boolean success;

    public static DeleteGatewayDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayDomainResponseBody self = new DeleteGatewayDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayDomainResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGatewayDomainResponseBody setData(DeleteGatewayDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGatewayDomainResponseBodyData getData() {
        return this.data;
    }

    public DeleteGatewayDomainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteGatewayDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGatewayDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGatewayDomainResponseBodyData extends TeaModel {
        // Indicates whether HTTP probing is allowed.
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        // The unique ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The name of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The ID of the certificate.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The time when the domain name was added.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The returned data.
        @NameInMap("Id")
        public Long id;

        // The protocol used by the gateway.
        @NameInMap("MustHttps")
        public Boolean mustHttps;

        // The ID of the domain name.
        @NameInMap("Name")
        public String name;

        // The ID of the gateway.
        @NameInMap("Protocol")
        public String protocol;

        public static DeleteGatewayDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGatewayDomainResponseBodyData self = new DeleteGatewayDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGatewayDomainResponseBodyData setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DeleteGatewayDomainResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public DeleteGatewayDomainResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteGatewayDomainResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteGatewayDomainResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteGatewayDomainResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteGatewayDomainResponseBodyData setMustHttps(Boolean mustHttps) {
            this.mustHttps = mustHttps;
            return this;
        }
        public Boolean getMustHttps() {
            return this.mustHttps;
        }

        public DeleteGatewayDomainResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteGatewayDomainResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}

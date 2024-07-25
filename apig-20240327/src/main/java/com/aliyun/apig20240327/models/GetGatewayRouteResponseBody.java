// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetGatewayRouteResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A1994B10-C6A8-58FA-8347-6A08B0D4EFDE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayRouteResponseBody self = new GetGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayRouteResponseBody setData(GetGatewayRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayRouteResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayRouteResponseBodyData extends TeaModel {
        @NameInMap("backend")
        public GatewayRouteBackend backend;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("description")
        public String description;

        @NameInMap("domainInfo")
        public GatewayRouteDomainInfo domainInfo;

        /**
         * <strong>example:</strong>
         * <p>gr-cptf6e7d5l***</p>
         */
        @NameInMap("gatewayRouteId")
        public String gatewayRouteId;

        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <strong>example:</strong>
         * <p>itemcenter-pre-route</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>NotPublished</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetGatewayRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteResponseBodyData self = new GetGatewayRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteResponseBodyData setBackend(GatewayRouteBackend backend) {
            this.backend = backend;
            return this;
        }
        public GatewayRouteBackend getBackend() {
            return this.backend;
        }

        public GetGatewayRouteResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetGatewayRouteResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGatewayRouteResponseBodyData setDomainInfo(GatewayRouteDomainInfo domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public GatewayRouteDomainInfo getDomainInfo() {
            return this.domainInfo;
        }

        public GetGatewayRouteResponseBodyData setGatewayRouteId(String gatewayRouteId) {
            this.gatewayRouteId = gatewayRouteId;
            return this;
        }
        public String getGatewayRouteId() {
            return this.gatewayRouteId;
        }

        public GetGatewayRouteResponseBodyData setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public GetGatewayRouteResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayRouteResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayRouteResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}

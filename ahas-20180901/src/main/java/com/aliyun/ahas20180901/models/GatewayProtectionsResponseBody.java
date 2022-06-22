// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GatewayProtectionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GatewayProtectionsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GatewayProtectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GatewayProtectionsResponseBody self = new GatewayProtectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GatewayProtectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GatewayProtectionsResponseBody setData(GatewayProtectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GatewayProtectionsResponseBodyData getData() {
        return this.data;
    }

    public GatewayProtectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GatewayProtectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GatewayProtectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GatewayProtectionsResponseBodyData extends TeaModel {
        @NameInMap("GatewayCount")
        public java.util.Map<String, ?> gatewayCount;

        @NameInMap("GatewayQps")
        public java.util.Map<String, ?> gatewayQps;

        public static GatewayProtectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GatewayProtectionsResponseBodyData self = new GatewayProtectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GatewayProtectionsResponseBodyData setGatewayCount(java.util.Map<String, ?> gatewayCount) {
            this.gatewayCount = gatewayCount;
            return this;
        }
        public java.util.Map<String, ?> getGatewayCount() {
            return this.gatewayCount;
        }

        public GatewayProtectionsResponseBodyData setGatewayQps(java.util.Map<String, ?> gatewayQps) {
            this.gatewayQps = gatewayQps;
            return this;
        }
        public java.util.Map<String, ?> getGatewayQps() {
            return this.gatewayQps;
        }

    }

    public static class QueryGatewayProtectionsResponseBodyData extends TeaModel {
        @NameInMap("GatewayCount")
        public java.util.Map<String, ?> gatewayCount;

        @NameInMap("GatewayQps")
        public java.util.Map<String, ?> gatewayQps;

        public static QueryGatewayProtectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGatewayProtectionsResponseBodyData self = new QueryGatewayProtectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGatewayProtectionsResponseBodyData setGatewayCount(java.util.Map<String, ?> gatewayCount) {
            this.gatewayCount = gatewayCount;
            return this;
        }
        public java.util.Map<String, ?> getGatewayCount() {
            return this.gatewayCount;
        }

        public QueryGatewayProtectionsResponseBodyData setGatewayQps(java.util.Map<String, ?> gatewayQps) {
            this.gatewayQps = gatewayQps;
            return this;
        }
        public java.util.Map<String, ?> getGatewayQps() {
            return this.gatewayQps;
        }

    }

}

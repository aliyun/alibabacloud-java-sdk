// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryGatewayProtectionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryGatewayProtectionsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryGatewayProtectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayProtectionsResponseBody self = new QueryGatewayProtectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGatewayProtectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGatewayProtectionsResponseBody setData(QueryGatewayProtectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGatewayProtectionsResponseBodyData getData() {
        return this.data;
    }

    public QueryGatewayProtectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGatewayProtectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGatewayProtectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

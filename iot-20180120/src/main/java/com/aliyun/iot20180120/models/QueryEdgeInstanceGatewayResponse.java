// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("GatewayList")
    @Validation(required = true)
    public java.util.List<QueryEdgeInstanceGatewayResponseGatewayList> gatewayList;

    public static QueryEdgeInstanceGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceGatewayResponse self = new QueryEdgeInstanceGatewayResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceGatewayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceGatewayResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceGatewayResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceGatewayResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceGatewayResponse setGatewayList(java.util.List<QueryEdgeInstanceGatewayResponseGatewayList> gatewayList) {
        this.gatewayList = gatewayList;
        return this;
    }
    public java.util.List<QueryEdgeInstanceGatewayResponseGatewayList> getGatewayList() {
        return this.gatewayList;
    }

    public static class QueryEdgeInstanceGatewayResponseGatewayList extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("EdgeVersion")
        @Validation(required = true)
        public String edgeVersion;

        public static QueryEdgeInstanceGatewayResponseGatewayList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceGatewayResponseGatewayList self = new QueryEdgeInstanceGatewayResponseGatewayList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceGatewayResponseGatewayList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryEdgeInstanceGatewayResponseGatewayList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryEdgeInstanceGatewayResponseGatewayList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryEdgeInstanceGatewayResponseGatewayList setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

    }

}

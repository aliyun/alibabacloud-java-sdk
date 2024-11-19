// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceGatewayResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message that is returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("GatewayList")
    public java.util.List<QueryEdgeInstanceGatewayResponseBodyGatewayList> gatewayList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>28D159F4-980F-423D-95F0-F705E9DFC016</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceGatewayResponseBody self = new QueryEdgeInstanceGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceGatewayResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceGatewayResponseBody setGatewayList(java.util.List<QueryEdgeInstanceGatewayResponseBodyGatewayList> gatewayList) {
        this.gatewayList = gatewayList;
        return this;
    }
    public java.util.List<QueryEdgeInstanceGatewayResponseBodyGatewayList> getGatewayList() {
        return this.gatewayList;
    }

    public QueryEdgeInstanceGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceGatewayResponseBodyGatewayList extends TeaModel {
        /**
         * <p>The name of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gateway_01</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The version number of Link IoT Edge.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("EdgeVersion")
        public String edgeVersion;

        /**
         * <p>The ID of the gateway in IoT Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>LuD9x5hiRUdVemWU****000101</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The key that uniquely identifies the product to which the gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1mAdeG****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static QueryEdgeInstanceGatewayResponseBodyGatewayList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceGatewayResponseBodyGatewayList self = new QueryEdgeInstanceGatewayResponseBodyGatewayList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryEdgeInstanceGatewayResponseBodyGatewayList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateConnectorResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>778C0B3B-03C1-5FC1-A947-36EDD13606AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorResponseBody self = new UpdateConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateConnectorResponseBody setData(UpdateConnectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateConnectorResponseBodyData getData() {
        return this.data;
    }

    public UpdateConnectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConnectorResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateConnectorResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>conn_file_e0c9db4030b2465a9478028f7d76cd92_1234</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        public static UpdateConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectorResponseBodyData self = new UpdateConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateConnectorResponseBodyData setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

    }

}

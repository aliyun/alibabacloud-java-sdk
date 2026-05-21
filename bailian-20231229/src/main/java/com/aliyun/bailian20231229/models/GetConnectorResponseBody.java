// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetConnectorResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Requests throttling triggered.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7BA8ADD9-53D6-53F0-918F-A1E776AD230E</p>
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
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectorResponseBody self = new GetConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConnectorResponseBody setData(GetConnectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConnectorResponseBodyData getData() {
        return this.data;
    }

    public GetConnectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectorResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConnectorResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>conn_file_e0c9db4030b2465a9478028f7d76cd92_1234</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ConnectorName")
        public String connectorName;

        /**
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("ConnectorType")
        public String connectorType;

        /**
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        public static GetConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConnectorResponseBodyData self = new GetConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConnectorResponseBodyData setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public GetConnectorResponseBodyData setConnectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }
        public String getConnectorName() {
            return this.connectorName;
        }

        public GetConnectorResponseBodyData setConnectorType(String connectorType) {
            this.connectorType = connectorType;
            return this;
        }
        public String getConnectorType() {
            return this.connectorType;
        }

        public GetConnectorResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}

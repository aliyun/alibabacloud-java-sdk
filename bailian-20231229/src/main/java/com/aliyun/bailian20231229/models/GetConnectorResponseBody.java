// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetConnectorResponseBody extends TeaModel {
    /**
     * <p>The result code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetConnectorResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Requests throttling triggered.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BA8ADD9-53D6-53F0-918F-A1E776AD230E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. The valid values are:</p>
     * <ul>
     * <li><p><code>true</code>: The call was successful.</p>
     * </li>
     * <li><p><code>false</code>: The call failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The ID of the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>conn_file_e0c9db4030b2465a9478028f7d76cd92_1234</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The name of the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ConnectorName")
        public String connectorName;

        /**
         * <p>The type of the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("ConnectorType")
        public String connectorType;

        /**
         * <p>The description of the connector.</p>
         * 
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddConnectorResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of <code>Success</code> indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned by the operation.</p>
     */
    @NameInMap("Data")
    public AddConnectorResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Current file status does not support delete.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35A267BF-FBFA-54DB-8394-AA3B0742D833</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddConnectorResponseBody self = new AddConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public AddConnectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddConnectorResponseBody setData(AddConnectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddConnectorResponseBodyData getData() {
        return this.data;
    }

    public AddConnectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddConnectorResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddConnectorResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>conn_file_e0c9db4030b2465a9478028f7d76cd92_1234</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        public static AddConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddConnectorResponseBodyData self = new AddConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddConnectorResponseBodyData setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

    }

}

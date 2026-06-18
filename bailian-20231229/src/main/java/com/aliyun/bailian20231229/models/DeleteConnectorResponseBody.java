// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteConnectorResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1C139002-0EC5-584C-A755-4B8B9FA080BE</p>
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

    public static DeleteConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectorResponseBody self = new DeleteConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConnectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteConnectorResponseBody setData(DeleteConnectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteConnectorResponseBodyData getData() {
        return this.data;
    }

    public DeleteConnectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConnectorResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteConnectorResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>conn_file_e0c9db4030b2465a9478028f7d76cd92_1234</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        public static DeleteConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteConnectorResponseBodyData self = new DeleteConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteConnectorResponseBodyData setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

    }

}

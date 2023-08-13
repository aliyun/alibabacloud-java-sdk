// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteStopGatewayResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the DeleteStopGateway operation. Valid values:</p>
     * <br>
     * <p>*   **0**: The metadata of the DBGateway is deleted.</p>
     * <p>*   **-1**: A system error occurs.</p>
     * <p>*   **-2**: The DBGateway does not exist.</p>
     * <p>*   **-3**: The DBGateway is not stopped and the metadata cannot be deleted.</p>
     * <p>*   **-4**: The metadata of the DBGateway fails to be deleted.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DeleteStopGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStopGatewayResponseBody self = new DeleteStopGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStopGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteStopGatewayResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteStopGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteStopGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStopGatewayResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

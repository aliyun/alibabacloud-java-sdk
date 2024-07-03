// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteStopGatewayResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the DeleteStopGateway operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The metadata of the DBGateway is deleted.</li>
     * <li><strong>-1</strong>: A system error occurs.</li>
     * <li><strong>-2</strong>: The DBGateway does not exist.</li>
     * <li><strong>-3</strong>: The DBGateway is not stopped and the metadata cannot be deleted.</li>
     * <li><strong>-4</strong>: The metadata of the DBGateway fails to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FC6C0929-29E1-59FD-8DFE-70D9D41E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

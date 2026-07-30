// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteStopGatewayResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status code indicating the result of the deletion:</p>
     * <ul>
     * <li><p><strong>0</strong>: Success. The metadata was deleted.</p>
     * </li>
     * <li><p><strong>-1</strong>: A system error occurred.</p>
     * </li>
     * <li><p><strong>-2</strong>: The specified database gateway does not exist.</p>
     * </li>
     * <li><p><strong>-3</strong>: The database gateway is still active (not stopped) and its metadata cannot be deleted.</p>
     * </li>
     * <li><p><strong>-4</strong>: Failed to delete the metadata.</p>
     * </li>
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
     * <p>When the request is successful, this parameter returns <strong>Successful</strong>. When the request fails, this parameter returns exception information such as error codes.</p>
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
     * <p>Indicates whether the request was successful:</p>
     * <ul>
     * <li><p><strong>true</strong>: The operation is successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The operation failed.</p>
     * </li>
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

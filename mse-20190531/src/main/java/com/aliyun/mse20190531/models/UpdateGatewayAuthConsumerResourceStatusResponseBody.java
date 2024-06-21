// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerResourceStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the execution was successful. Valid values:</p>
     * <ul>
     * <li>true: The execution was successful.</li>
     * <li>false: The execution failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The dynamic part in the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in the <code>ErrMessage</code> parameter.</p>
     * <blockquote>
     * <p> If the return value of the <code>ErrMessage</code> parameter is <code>The Value of Input Parameter %s is not valid</code> and the return value of the <code>DynamicMessage</code> parameter is <code>DtsJobId</code>, the specified <code>DtsJobId</code> parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateGatewayAuthConsumerResourceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerResourceStatusResponseBody self = new UpdateGatewayAuthConsumerResourceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGatewayAuthConsumerResourceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

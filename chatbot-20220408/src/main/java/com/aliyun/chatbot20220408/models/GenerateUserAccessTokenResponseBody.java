// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GenerateUserAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The generated token value.</p>
     * 
     * <strong>example:</strong>
     * <p>DDEXEDAFWAGASDFWAEFFAWEFAWFWEAFWAFWAEF</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message for a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter.Invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6988CE6-41CF-1103-9BEC-2B20D26C0B51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: <code>true</code> and <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateUserAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUserAccessTokenResponseBody self = new GenerateUserAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUserAccessTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateUserAccessTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GenerateUserAccessTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateUserAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUserAccessTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

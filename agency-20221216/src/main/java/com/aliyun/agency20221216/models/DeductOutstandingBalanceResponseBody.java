// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class DeductOutstandingBalanceResponseBody extends TeaModel {
    /**
     * <p>The result code. Valid values:
     * 200: OK.
     * 1109: System error.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message. The value is the same as the Code parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. A unique identifier that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current API call itself is successful. Valid values: True and False. This does not indicate the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeductOutstandingBalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeductOutstandingBalanceResponseBody self = new DeductOutstandingBalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeductOutstandingBalanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeductOutstandingBalanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeductOutstandingBalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeductOutstandingBalanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

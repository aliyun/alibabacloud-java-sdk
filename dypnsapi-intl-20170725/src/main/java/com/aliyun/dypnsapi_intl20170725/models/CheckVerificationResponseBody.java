// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi_intl20170725.models;

import com.aliyun.tea.*;

public class CheckVerificationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that was returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that was returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The data that was returned for the successful request. Example: "Model": { "phoneNumber": "", "channel": "", "verificationId": "", "status": "approved" },</p>
     */
    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    /**
     * <p>The ID of the request. An ID is a unique identifier that Alibaba Cloud generates for a request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true: The request was successful. false: The request failed.</p>
     */
    @NameInMap("Success")
    public String success;

    public static CheckVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckVerificationResponseBody self = new CheckVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckVerificationResponseBody setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public CheckVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckVerificationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

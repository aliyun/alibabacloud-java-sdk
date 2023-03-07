// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SaveUserCreditResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed. For more information, see the "Error codes" section of the topic.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveUserCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveUserCreditResponseBody self = new SaveUserCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveUserCreditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveUserCreditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveUserCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveUserCreditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

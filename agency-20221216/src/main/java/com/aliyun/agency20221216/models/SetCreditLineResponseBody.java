// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetCreditLineResponseBody extends TeaModel {
    /**
     * <p>The result code. Valid values:</p>
     * <ul>
     * <li>200: OK.</li>
     * <li>1109: System error.</li>
     * <li>3040: The sub-account is frozen and the operation cannot be completed.</li>
     * <li>3041: The credit limit is not a number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that corresponds to the result code.</p>
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
     * <p>Indicates whether the API call is successful. Valid values: True and False. This does not indicate whether the subsequent business operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetCreditLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLineResponseBody self = new SetCreditLineResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCreditLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetCreditLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetCreditLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetCreditLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

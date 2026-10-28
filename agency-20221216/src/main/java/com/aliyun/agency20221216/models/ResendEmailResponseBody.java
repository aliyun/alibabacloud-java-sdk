// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ResendEmailResponseBody extends TeaModel {
    /**
     * <p>The result code.
     * Error code. Valid values:</p>
     * <ul>
     * <li>200: OK.</li>
     * <li>1109: System error.</li>
     * <li>3058: Emails are sent too frequently. A maximum of 10 emails can be sent within 5 minutes.</li>
     * <li>3057: InviteId is empty.</li>
     * <li>3060: No sending record found for the specified InviteId.</li>
     * <li>3061: The registration URL has expired and the email cannot be resent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result message.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
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
     * <p>Valid values: True/False. Indicates whether the current API call itself is successful. This does not indicate the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ResendEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailResponseBody self = new ResendEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendEmailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResendEmailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResendEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResendEmailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

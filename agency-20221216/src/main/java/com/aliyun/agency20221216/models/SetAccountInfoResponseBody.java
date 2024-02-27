// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetAccountInfoResponseBody extends TeaModel {
    /**
     * <p>Result Code:</p>
     * <p>*   200 OK</p>
     * <p>*   1109 System error</p>
     * <p>*   3030 Sub Account Nickname exceeds maximum length,  maximum length 150 bytes.</p>
     * <p>*   3031 Remark exceeds maximum length,  maximum length 3000 bytes.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message information</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccountInfoResponseBody self = new SetAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

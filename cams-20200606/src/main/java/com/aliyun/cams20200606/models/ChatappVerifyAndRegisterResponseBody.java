// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappVerifyAndRegisterResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChatappVerifyAndRegisterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappVerifyAndRegisterResponseBody self = new ChatappVerifyAndRegisterResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatappVerifyAndRegisterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChatappVerifyAndRegisterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatappVerifyAndRegisterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

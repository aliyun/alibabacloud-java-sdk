// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatappTemplateResponseBody extends TeaModel {
    // The HTTP status code returned.
    // 
    // *   A code of OK indicates that the call is successful.
    // *   Other codes indicate that the call fails. For more information, see [Error codes](~~196974~~).
    @NameInMap("Code")
    public String code;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatappTemplateResponseBody self = new DeleteChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChatappTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteChatappTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteChatappTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

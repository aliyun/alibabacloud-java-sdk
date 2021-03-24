// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetMessageExtensionByKeysResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码，成功时为0
    @NameInMap("Code")
    public String code;

    // 错误信息，成功时为空
    @NameInMap("Message")
    public String message;

    public static SetMessageExtensionByKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMessageExtensionByKeysResponseBody self = new SetMessageExtensionByKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMessageExtensionByKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetMessageExtensionByKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetMessageExtensionByKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}

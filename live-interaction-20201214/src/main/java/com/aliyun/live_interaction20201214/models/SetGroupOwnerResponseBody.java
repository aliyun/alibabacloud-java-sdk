// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupOwnerResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 错误码。
    @NameInMap("Code")
    public String code;

    // 错误信息。
    @NameInMap("Message")
    public String message;

    public static SetGroupOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGroupOwnerResponseBody self = new SetGroupOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGroupOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetGroupOwnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetGroupOwnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}

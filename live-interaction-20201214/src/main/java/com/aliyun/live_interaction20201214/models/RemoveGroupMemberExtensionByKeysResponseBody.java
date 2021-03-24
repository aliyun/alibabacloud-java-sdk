// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupMemberExtensionByKeysResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    public static RemoveGroupMemberExtensionByKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMemberExtensionByKeysResponseBody self = new RemoveGroupMemberExtensionByKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMemberExtensionByKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveGroupMemberExtensionByKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveGroupMemberExtensionByKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupExtensionByKeysResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static RemoveGroupExtensionByKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupExtensionByKeysResponseBody self = new RemoveGroupExtensionByKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveGroupExtensionByKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveGroupExtensionByKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveGroupExtensionByKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}

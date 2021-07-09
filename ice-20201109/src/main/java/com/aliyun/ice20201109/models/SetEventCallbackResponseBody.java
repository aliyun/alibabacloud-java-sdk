// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetEventCallbackResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否设置成功
    @NameInMap("Success")
    public Boolean success;

    public static SetEventCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetEventCallbackResponseBody self = new SetEventCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SetEventCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetEventCallbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

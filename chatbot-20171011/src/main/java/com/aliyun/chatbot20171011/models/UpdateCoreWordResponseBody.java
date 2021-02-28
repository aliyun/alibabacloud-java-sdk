// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateCoreWordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateCoreWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoreWordResponseBody self = new UpdateCoreWordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCoreWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCoreWordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

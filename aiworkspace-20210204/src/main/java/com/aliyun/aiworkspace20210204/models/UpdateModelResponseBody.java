// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelResponseBody self = new UpdateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

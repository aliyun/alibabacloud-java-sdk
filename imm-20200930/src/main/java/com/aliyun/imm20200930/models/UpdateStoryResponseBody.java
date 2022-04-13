// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateStoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryResponseBody self = new UpdateStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBoardCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardCallbackResponseBody self = new UpdateBoardCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBoardCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

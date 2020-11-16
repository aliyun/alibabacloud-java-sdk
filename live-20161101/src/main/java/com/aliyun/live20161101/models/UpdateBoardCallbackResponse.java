// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardCallbackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateBoardCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardCallbackResponse self = new UpdateBoardCallbackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBoardCallbackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

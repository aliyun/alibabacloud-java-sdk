// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetBoardCallbackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetBoardCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SetBoardCallbackResponse self = new SetBoardCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SetBoardCallbackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

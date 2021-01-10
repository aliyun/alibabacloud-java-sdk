// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetBoardCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetBoardCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetBoardCallbackResponseBody self = new SetBoardCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SetBoardCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

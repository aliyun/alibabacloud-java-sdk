// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteScaleStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScaleStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScaleStrategyResponseBody self = new DeleteScaleStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScaleStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

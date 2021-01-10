// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class RollBackFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RollBackFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollBackFlowResponseBody self = new RollBackFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public RollBackFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

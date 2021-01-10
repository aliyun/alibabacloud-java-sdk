// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class AbolishFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AbolishFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbolishFlowResponseBody self = new AbolishFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public AbolishFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

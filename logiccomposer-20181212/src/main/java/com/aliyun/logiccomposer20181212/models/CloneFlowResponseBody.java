// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class CloneFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CloneFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowResponseBody self = new CloneFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SuspendFlowResponseBody extends TeaModel {
    // 返回执行结果。
    @NameInMap("Data")
    public Boolean data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static SuspendFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendFlowResponseBody self = new SuspendFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendFlowResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SuspendFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

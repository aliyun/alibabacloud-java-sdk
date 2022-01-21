// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class StartFlowResponseBody extends TeaModel {
    // 返回执行结果，包含如下：true: 启动成功，false: 启动失败。
    @NameInMap("Data")
    public Boolean data;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static StartFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartFlowResponseBody self = new StartFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public StartFlowResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public StartFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RerunFlowResponseBody extends TeaModel {
    // 返回执行结果，包含如下：true: 重试工作流成功，false: 重试工作流失败。
    @NameInMap("Data")
    public Boolean data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static RerunFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RerunFlowResponseBody self = new RerunFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public RerunFlowResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RerunFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

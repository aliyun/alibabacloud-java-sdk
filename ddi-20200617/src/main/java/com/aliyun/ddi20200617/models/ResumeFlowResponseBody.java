// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ResumeFlowResponseBody extends TeaModel {
    // 返回执行结果。
    @NameInMap("Data")
    public Boolean data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeFlowResponseBody self = new ResumeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeFlowResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ResumeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

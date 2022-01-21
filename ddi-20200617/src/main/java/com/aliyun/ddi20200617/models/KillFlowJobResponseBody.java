// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class KillFlowJobResponseBody extends TeaModel {
    // 返回执行结果，包含如下：true（执行成功），false（执行失败）
    @NameInMap("Data")
    public Boolean data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static KillFlowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillFlowJobResponseBody self = new KillFlowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public KillFlowJobResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public KillFlowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

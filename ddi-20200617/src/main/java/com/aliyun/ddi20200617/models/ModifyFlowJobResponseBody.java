// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowJobResponseBody extends TeaModel {
    // API调用结果：true（修改成功），false（修改失败）
    @NameInMap("Data")
    public Boolean data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFlowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowJobResponseBody self = new ModifyFlowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowJobResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyFlowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

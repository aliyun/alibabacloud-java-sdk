// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ModifyFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowResponseBody self = new ModifyFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

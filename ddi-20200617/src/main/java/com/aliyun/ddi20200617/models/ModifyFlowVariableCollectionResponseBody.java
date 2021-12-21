// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowVariableCollectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFlowVariableCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowVariableCollectionResponseBody self = new ModifyFlowVariableCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowVariableCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

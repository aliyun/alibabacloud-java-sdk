// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowForWebResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFlowForWebResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowForWebResponseBody self = new ModifyFlowForWebResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowForWebResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyFlowForWebResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

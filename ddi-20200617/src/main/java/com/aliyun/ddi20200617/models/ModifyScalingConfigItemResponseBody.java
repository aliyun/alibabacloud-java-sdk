// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigItemResponseBody extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public Boolean data;

    public static ModifyScalingConfigItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigItemResponseBody self = new ModifyScalingConfigItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScalingConfigItemResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}

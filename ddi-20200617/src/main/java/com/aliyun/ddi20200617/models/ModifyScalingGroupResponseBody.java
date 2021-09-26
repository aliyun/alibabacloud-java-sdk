// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupResponseBody extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public Boolean data;

    public static ModifyScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupResponseBody self = new ModifyScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScalingGroupResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class AddScalingConfigItemResponseBody extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public String data;

    public static AddScalingConfigItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddScalingConfigItemResponseBody self = new AddScalingConfigItemResponseBody();
        return TeaModel.build(map, self);
    }

    public AddScalingConfigItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddScalingConfigItemResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}

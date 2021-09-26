// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RunScalingActionResponseBody extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public String data;

    public static RunScalingActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunScalingActionResponseBody self = new RunScalingActionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunScalingActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunScalingActionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}

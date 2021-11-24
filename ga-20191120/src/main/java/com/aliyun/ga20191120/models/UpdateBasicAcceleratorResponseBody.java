// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicAcceleratorResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBasicAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicAcceleratorResponseBody self = new UpdateBasicAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBasicAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

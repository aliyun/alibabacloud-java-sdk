// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAcceleratorResponseBody extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBasicAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAcceleratorResponseBody self = new DeleteBasicAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DeleteBasicAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

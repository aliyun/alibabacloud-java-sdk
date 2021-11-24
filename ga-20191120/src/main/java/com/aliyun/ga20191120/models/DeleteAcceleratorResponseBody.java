// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteAcceleratorResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAcceleratorResponseBody self = new DeleteAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DeleteAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

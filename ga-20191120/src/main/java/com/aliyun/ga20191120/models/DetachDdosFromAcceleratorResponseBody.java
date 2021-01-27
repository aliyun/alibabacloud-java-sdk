// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachDdosFromAcceleratorResponseBody extends TeaModel {
    @NameInMap("DdosId")
    public String ddosId;

    @NameInMap("RequestId")
    public String requestId;

    public static DetachDdosFromAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDdosFromAcceleratorResponseBody self = new DetachDdosFromAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDdosFromAcceleratorResponseBody setDdosId(String ddosId) {
        this.ddosId = ddosId;
        return this;
    }
    public String getDdosId() {
        return this.ddosId;
    }

    public DetachDdosFromAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

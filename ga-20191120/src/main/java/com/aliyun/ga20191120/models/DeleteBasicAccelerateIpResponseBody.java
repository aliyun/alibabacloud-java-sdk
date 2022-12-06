// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAccelerateIpResponseBody extends TeaModel {
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBasicAccelerateIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAccelerateIpResponseBody self = new DeleteBasicAccelerateIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAccelerateIpResponseBody setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public DeleteBasicAccelerateIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBandwidthResourcePackagesResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBandwidthResourcePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthResourcePackagesResponseBody self = new CreateBandwidthResourcePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBandwidthResourcePackagesResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateBandwidthResourcePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

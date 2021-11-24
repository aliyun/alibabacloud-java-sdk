// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthPackageResponseBody self = new CreateBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBandwidthPackageResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateBandwidthPackageResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

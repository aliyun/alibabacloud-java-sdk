// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    @NameInMap("CenBandwidthPackageOrderId")
    public String cenBandwidthPackageOrderId;

    public static CreateCenBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenBandwidthPackageResponseBody self = new CreateCenBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCenBandwidthPackageResponseBody setCenBandwidthPackageId(String cenBandwidthPackageId) {
        this.cenBandwidthPackageId = cenBandwidthPackageId;
        return this;
    }
    public String getCenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }

    public CreateCenBandwidthPackageResponseBody setCenBandwidthPackageOrderId(String cenBandwidthPackageOrderId) {
        this.cenBandwidthPackageOrderId = cenBandwidthPackageOrderId;
        return this;
    }
    public String getCenBandwidthPackageOrderId() {
        return this.cenBandwidthPackageOrderId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>cenbwp-4c2zaavbvh5fx****</p>
     */
    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    /**
     * <p>The ID of the order for the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>20156420004****</p>
     */
    @NameInMap("CenBandwidthPackageOrderId")
    public String cenBandwidthPackageOrderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4B345CD-2CBA-4881-AF6D-E5D9BAE1CA7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenBandwidthPackageResponseBody self = new CreateCenBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
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

    public CreateCenBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

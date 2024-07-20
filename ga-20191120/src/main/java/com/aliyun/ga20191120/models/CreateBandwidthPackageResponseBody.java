// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The order ID.</p>
     * <p>If bills are not automatically paid, you must go to the Order Center to complete the payments.</p>
     * <p>This parameter is returned only if ChargeType is set to PREPAY. If AutoPay is set to false, you must go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Order Center</a> to complete the payment.</p>
     * 
     * <strong>example:</strong>
     * <p>208257****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4B6DBBB0-2D01-4C6A-A384-4129266E6B78</p>
     */
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

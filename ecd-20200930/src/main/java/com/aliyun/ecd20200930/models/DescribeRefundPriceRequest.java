// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRefundPriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <strong>example:</strong>
     * <p>RemainRefund</p>
     */
    @NameInMap("RefundType")
    public String refundType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRefundPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefundPriceRequest self = new DescribeRefundPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRefundPriceRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeRefundPriceRequest setRefundType(String refundType) {
        this.refundType = refundType;
        return this;
    }
    public String getRefundType() {
        return this.refundType;
    }

    public DescribeRefundPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

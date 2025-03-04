// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRefundPriceRequest extends TeaModel {
    /**
     * <p>ID of cloud computer N. Valid values of N: 1 to 20.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The unsubscription type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RemainRefund: refunds the remaining balance and releases resources.</li>
     * <li>RenewRefund: refunds only the renewal fee and adjusts the expiration date accordingly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RemainRefund</p>
     */
    @NameInMap("RefundType")
    public String refundType;

    /**
     * <p>The ID of the region. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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

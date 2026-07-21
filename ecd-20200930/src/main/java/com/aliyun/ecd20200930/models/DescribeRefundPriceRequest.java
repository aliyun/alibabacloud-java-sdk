// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRefundPriceRequest extends TeaModel {
    /**
     * <p>The list of cloud computer IDs. You can specify one or more IDs. Valid values of N: 1 to 20.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The unsubscription type.</p>
     * 
     * <strong>example:</strong>
     * <p>RemainRefund</p>
     */
    @NameInMap("RefundType")
    public String refundType;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

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

    public DescribeRefundPriceRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRefundPriceRequest extends TeaModel {
    /**
     * <p>A list of cloud desktop IDs. You can specify one or more IDs. The number of IDs (N) must be between 1 and 20.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>Refund type.</p>
     * 
     * <strong>example:</strong>
     * <p>RemainRefund</p>
     */
    @NameInMap("RefundType")
    public String refundType;

    /**
     * <p>Region ID. Call <a href="~~DescribeRegions~~">DescribeRegions</a> to get a list of regions supported by WUYING Workspace.</p>
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

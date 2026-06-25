// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ExpandDataVolumeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The IDs of the cloud phone matrices.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The size of the instance storage. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PhoneDataVolume")
    public Integer phoneDataVolume;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The size of the shared storage for the matrix. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ShareDataVolume")
    public Integer shareDataVolume;

    public static ExpandDataVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandDataVolumeRequest self = new ExpandDataVolumeRequest();
        return TeaModel.build(map, self);
    }

    public ExpandDataVolumeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ExpandDataVolumeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ExpandDataVolumeRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ExpandDataVolumeRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public ExpandDataVolumeRequest setPhoneDataVolume(Integer phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
        return this;
    }
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    public ExpandDataVolumeRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ExpandDataVolumeRequest setShareDataVolume(Integer shareDataVolume) {
        this.shareDataVolume = shareDataVolume;
        return this;
    }
    public Integer getShareDataVolume() {
        return this.shareDataVolume;
    }

}

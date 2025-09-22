// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ExpandPhoneDataVolumeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PhoneDataVolume")
    public Integer phoneDataVolume;

    /**
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static ExpandPhoneDataVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandPhoneDataVolumeRequest self = new ExpandPhoneDataVolumeRequest();
        return TeaModel.build(map, self);
    }

    public ExpandPhoneDataVolumeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ExpandPhoneDataVolumeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ExpandPhoneDataVolumeRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ExpandPhoneDataVolumeRequest setPhoneDataVolume(Integer phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
        return this;
    }
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    public ExpandPhoneDataVolumeRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}

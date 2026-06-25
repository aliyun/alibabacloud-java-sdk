// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpgradeAndroidInstanceGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The number of instances to add to the instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("IncreaseNumberOfInstance")
    public Integer increaseNumberOfInstance;

    /**
     * <p>The ID of the instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-asguicdjh****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The promotion ID.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static UpgradeAndroidInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAndroidInstanceGroupRequest self = new UpgradeAndroidInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAndroidInstanceGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpgradeAndroidInstanceGroupRequest setIncreaseNumberOfInstance(Integer increaseNumberOfInstance) {
        this.increaseNumberOfInstance = increaseNumberOfInstance;
        return this;
    }
    public Integer getIncreaseNumberOfInstance() {
        return this.increaseNumberOfInstance;
    }

    public UpgradeAndroidInstanceGroupRequest setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    public UpgradeAndroidInstanceGroupRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public UpgradeAndroidInstanceGroupRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}

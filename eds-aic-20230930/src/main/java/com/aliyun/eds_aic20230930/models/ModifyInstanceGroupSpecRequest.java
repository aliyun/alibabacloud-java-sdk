// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyInstanceGroupSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong> (default): Only generates an order without deducting fees.</li>
     * </ul>
     * <blockquote>
     * <p>If your payment method balance is insufficient, set this parameter to false. An unpaid order is generated, and you can log on to the Cloud Phone console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The list of instance group IDs.</p>
     */
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    /**
     * <p>The instance group specification. You can call <a href="~~DescribeSpec~~">DescribeSpec</a> to query the specifications available for purchase for cloud phones.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acp.basic.small</p>
     */
    @NameInMap("InstanceGroupSpec")
    public String instanceGroupSpec;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static ModifyInstanceGroupSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceGroupSpecRequest self = new ModifyInstanceGroupSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceGroupSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceGroupSpecRequest setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public ModifyInstanceGroupSpecRequest setInstanceGroupSpec(String instanceGroupSpec) {
        this.instanceGroupSpec = instanceGroupSpec;
        return this;
    }
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
    }

    public ModifyInstanceGroupSpecRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}

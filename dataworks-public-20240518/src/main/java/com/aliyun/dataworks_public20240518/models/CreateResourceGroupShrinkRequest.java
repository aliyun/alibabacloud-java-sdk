// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceGroupShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rg-aek2kqofrgXXXXX</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    @NameInMap("AliyunResourceTags")
    public String aliyunResourceTagsShrink;

    @NameInMap("AutoRenewEnabled")
    public Boolean autoRenewEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eb870033-74c8-4b1b-9664-04c4e7cc3465</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common_resource_group</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>创建用于普通任务的通用资源组</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The specifications of the resource group. Unit: compute unit (CU). This parameter is required only when you set the PaymentType parameter to PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Spec")
    public Integer spec;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    public static CreateResourceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupShrinkRequest self = new CreateResourceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupShrinkRequest setAliyunResourceGroupId(String aliyunResourceGroupId) {
        this.aliyunResourceGroupId = aliyunResourceGroupId;
        return this;
    }
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    public CreateResourceGroupShrinkRequest setAliyunResourceTagsShrink(String aliyunResourceTagsShrink) {
        this.aliyunResourceTagsShrink = aliyunResourceTagsShrink;
        return this;
    }
    public String getAliyunResourceTagsShrink() {
        return this.aliyunResourceTagsShrink;
    }

    public CreateResourceGroupShrinkRequest setAutoRenewEnabled(Boolean autoRenewEnabled) {
        this.autoRenewEnabled = autoRenewEnabled;
        return this;
    }
    public Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    public CreateResourceGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateResourceGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceGroupShrinkRequest setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public CreateResourceGroupShrinkRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public CreateResourceGroupShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateResourceGroupShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateResourceGroupShrinkRequest setSpec(Integer spec) {
        this.spec = spec;
        return this;
    }
    public Integer getSpec() {
        return this.spec;
    }

    public CreateResourceGroupShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateResourceGroupShrinkRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}

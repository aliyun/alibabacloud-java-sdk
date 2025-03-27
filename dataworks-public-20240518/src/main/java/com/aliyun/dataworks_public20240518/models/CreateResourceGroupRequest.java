// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2kqofrgXXXXX</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("AliyunResourceTags")
    public java.util.List<CreateResourceGroupRequestAliyunResourceTags> aliyunResourceTags;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     */
    @NameInMap("AutoRenewEnabled")
    public Boolean autoRenewEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eb870033-74c8-4b1b-9664-04c4e7cc3465</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the serverless resource group. The name can be a maximum of 128 characters in length and can contain letters, digits, and underscores (_). The name must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common_resource_group</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <p>The unit of the subscription duration. Valid values: Month and Year.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>The billing method of the serverless resource group. Valid values: PrePaid and PostPaid. The value PrePaid indicates the subscription billing method, and the value PostPaid indicates the pay-as-you-go billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The description of the serverless resource group. The description can be a maximum of 128 characters in length and can contain letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>Create a serverless resource group for common tasks</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The specifications of the serverless resource group. Unit: CU. This parameter is required only if you set the PaymentType parameter to PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Spec")
    public Integer spec;

    /**
     * <p>The ID of the virtual private cloud (VPC) with which the serverless resource group is associated by default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the vSwitch with which the serverless resource group is associated by default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    public static CreateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupRequest self = new CreateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupRequest setAliyunResourceGroupId(String aliyunResourceGroupId) {
        this.aliyunResourceGroupId = aliyunResourceGroupId;
        return this;
    }
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    public CreateResourceGroupRequest setAliyunResourceTags(java.util.List<CreateResourceGroupRequestAliyunResourceTags> aliyunResourceTags) {
        this.aliyunResourceTags = aliyunResourceTags;
        return this;
    }
    public java.util.List<CreateResourceGroupRequestAliyunResourceTags> getAliyunResourceTags() {
        return this.aliyunResourceTags;
    }

    public CreateResourceGroupRequest setAutoRenewEnabled(Boolean autoRenewEnabled) {
        this.autoRenewEnabled = autoRenewEnabled;
        return this;
    }
    public Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    public CreateResourceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateResourceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceGroupRequest setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public CreateResourceGroupRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public CreateResourceGroupRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateResourceGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateResourceGroupRequest setSpec(Integer spec) {
        this.spec = spec;
        return this;
    }
    public Integer getSpec() {
        return this.spec;
    }

    public CreateResourceGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateResourceGroupRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static class CreateResourceGroupRequestAliyunResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateResourceGroupRequestAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupRequestAliyunResourceTags self = new CreateResourceGroupRequestAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupRequestAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceGroupRequestAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

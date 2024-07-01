// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public CreateServiceInstanceShrinkRequestCommodity commodity;

    /**
     * <p>接收告警的云监控联系人组。</p>
     * 
     * <strong>example:</strong>
     * <p>云账号报警联系人</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>服务实例名称。格式要求如下：</p>
     * <ul>
     * <li><p>长度不超过64个字符。</p>
     * </li>
     * <li><p>必须以数字或英文字母开头，可包含数字、英文字母、短划线（-）和下划线（_）。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OperationMetadata")
    public CreateServiceInstanceShrinkRequestOperationMetadata operationMetadata;

    /**
     * <strong>example:</strong>
     * <p>{&quot;NodeCount&quot;: 3, &quot;SystemDiskSize&quot;: 40, &quot;InstancePassword&quot;: &quot;******&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceAutoPay")
    public Boolean resourceAutoPay;

    /**
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a54420****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <strong>example:</strong>
     * <p>yuncode5425200001</p>
     */
    @NameInMap("SpecificationCode")
    public String specificationCode;

    /**
     * <p>套餐规格名称。</p>
     * 
     * <strong>example:</strong>
     * <p>套餐一</p>
     */
    @NameInMap("SpecificationName")
    public String specificationName;

    /**
     * <p>用户自定义标签。</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServiceInstanceShrinkRequestTag> tag;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>使用类型。可选值：</p>
     * <ul>
     * <li><p>Trial：支持试用。</p>
     * </li>
     * <li><p>NotTrial：不支持试用。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Trial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    public static CreateServiceInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceShrinkRequest self = new CreateServiceInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceInstanceShrinkRequest setCommodity(CreateServiceInstanceShrinkRequestCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public CreateServiceInstanceShrinkRequestCommodity getCommodity() {
        return this.commodity;
    }

    public CreateServiceInstanceShrinkRequest setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
        return this;
    }
    public String getContactGroup() {
        return this.contactGroup;
    }

    public CreateServiceInstanceShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateServiceInstanceShrinkRequest setEnableInstanceOps(Boolean enableInstanceOps) {
        this.enableInstanceOps = enableInstanceOps;
        return this;
    }
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
    }

    public CreateServiceInstanceShrinkRequest setEnableUserPrometheus(Boolean enableUserPrometheus) {
        this.enableUserPrometheus = enableUserPrometheus;
        return this;
    }
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    public CreateServiceInstanceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceInstanceShrinkRequest setOperationMetadata(CreateServiceInstanceShrinkRequestOperationMetadata operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public CreateServiceInstanceShrinkRequestOperationMetadata getOperationMetadata() {
        return this.operationMetadata;
    }

    public CreateServiceInstanceShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateServiceInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceInstanceShrinkRequest setResourceAutoPay(Boolean resourceAutoPay) {
        this.resourceAutoPay = resourceAutoPay;
        return this;
    }
    public Boolean getResourceAutoPay() {
        return this.resourceAutoPay;
    }

    public CreateServiceInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServiceInstanceShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceInstanceShrinkRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CreateServiceInstanceShrinkRequest setSpecificationCode(String specificationCode) {
        this.specificationCode = specificationCode;
        return this;
    }
    public String getSpecificationCode() {
        return this.specificationCode;
    }

    public CreateServiceInstanceShrinkRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public CreateServiceInstanceShrinkRequest setTag(java.util.List<CreateServiceInstanceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateServiceInstanceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateServiceInstanceShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateServiceInstanceShrinkRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

    public static class CreateServiceInstanceShrinkRequestCommodity extends TeaModel {
        @NameInMap("AutoPay")
        public Boolean autoPay;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PayPeriod")
        public Long payPeriod;

        /**
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PayPeriodUnit")
        public String payPeriodUnit;

        public static CreateServiceInstanceShrinkRequestCommodity build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceShrinkRequestCommodity self = new CreateServiceInstanceShrinkRequestCommodity();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceShrinkRequestCommodity setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public CreateServiceInstanceShrinkRequestCommodity setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateServiceInstanceShrinkRequestCommodity setPayPeriod(Long payPeriod) {
            this.payPeriod = payPeriod;
            return this;
        }
        public Long getPayPeriod() {
            return this.payPeriod;
        }

        public CreateServiceInstanceShrinkRequestCommodity setPayPeriodUnit(String payPeriodUnit) {
            this.payPeriodUnit = payPeriodUnit;
            return this;
        }
        public String getPayPeriodUnit() {
            return this.payPeriodUnit;
        }

    }

    public static class CreateServiceInstanceShrinkRequestOperationMetadata extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-01-28T06:48:56Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <pre><code class="language-json">  {
         *     &quot;vncInfo&quot;: [
         *       {
         *         &quot;instanceId&quot;: &quot;i-001&quot;,
         *         &quot;username&quot;: &quot;admin&quot;,
         *         &quot;password&quot;: &quot;******&quot;,
         *         &quot;vncPassword&quot;: &quot;******&quot;
         *       }
         *     ]
         *   }
         * </code></pre>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <strong>example:</strong>
         * <p>{   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,   &quot;Type&quot;: &quot;ResourceIds&quot;,   &quot;ResourceIds&quot;: {     &quot;ALIYUN::ECS::INSTANCE&quot;: [&quot;i-xxx&quot;, &quot;i-yyy&quot;],     &quot;ALIYUN::RDS::INSTANCE&quot;: [&quot;rm-xxx&quot;, &quot;rm-yyy&quot;],     &quot;ALIYUN::VPC::VPC&quot;: [&quot;vpc-xxx&quot;, &quot;vpc-yyy&quot;],     &quot;ALIYUN::SLB::INSTANCE&quot;: [&quot;lb-xxx&quot;, &quot;lb-yyy&quot;]   } }</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <strong>example:</strong>
         * <p>2021-12-29T06:48:56Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static CreateServiceInstanceShrinkRequestOperationMetadata build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceShrinkRequestOperationMetadata self = new CreateServiceInstanceShrinkRequestOperationMetadata();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceShrinkRequestOperationMetadata setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateServiceInstanceShrinkRequestOperationMetadata setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public CreateServiceInstanceShrinkRequestOperationMetadata setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public CreateServiceInstanceShrinkRequestOperationMetadata setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public CreateServiceInstanceShrinkRequestOperationMetadata setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateServiceInstanceShrinkRequestTag extends TeaModel {
        /**
         * <p>标签键。</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServiceInstanceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceShrinkRequestTag self = new CreateServiceInstanceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceInstanceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

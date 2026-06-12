// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceShrinkRequest extends TeaModel {
    /**
     * <p>A client-generated, unique token that ensures the idempotence of the request. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information about the Alibaba Cloud Marketplace purchase order. You do not need to specify this parameter if the service is not listed in Alibaba Cloud Marketplace or if you use the pay-as-you-go billing method.</p>
     */
    @NameInMap("Commodity")
    public CreateServiceInstanceShrinkRequestCommodity commodity;

    /**
     * <p>The CloudMonitor alert contact group that receives alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud account alert contact</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <p>Indicates whether to perform a dry run for the request. The dry run checks for permissions and instance status. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sends the request without creating the service instance.</p>
     * </li>
     * <li><p><strong>false</strong>: Sends the request and creates the service instance after the check is passed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Indicates whether the service instance has the O\&amp;M feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The service instance has the O\&amp;M feature.</p>
     * </li>
     * <li><p><strong>false</strong>: The service instance does not have the O\&amp;M feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    /**
     * <p>Indicates whether to enable Prometheus monitoring. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>The name of the service instance. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>The name can be up to 64 characters in length.</p>
     * </li>
     * <li><p>It must start with a letter or a digit and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The O\&amp;M configuration.</p>
     */
    @NameInMap("OperationMetadata")
    public CreateServiceInstanceShrinkRequestOperationMetadata operationMetadata;

    /**
     * <p>The parameters for deploying the user instance.</p>
     * <blockquote>
     * <p>If the service instance contains deployment region information, you must specify the region in the deployment parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;RegionId&quot;: &quot;cn-hangzhou&quot;
     *       &quot;NodeCount&quot;: 3,
     *       &quot;SystemDiskSize&quot;: 40,
     *       &quot;InstancePassword&quot;: &quot;******&quot;
     * }</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: China (Hangzhou).</p>
     * </li>
     * <li><p>ap-southeast-1: Singapore.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Indicates whether to automatically deduct the payment from your account balance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable automatic payment.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable automatic payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceAutoPay")
    public Boolean resourceAutoPay;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a54420****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The ID of the service instance to convert to a paid instance.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d32fbcef30664721b785</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The commodity specification code.</p>
     * 
     * <strong>example:</strong>
     * <p>yuncode5425200001</p>
     */
    @NameInMap("SpecificationCode")
    public String specificationCode;

    /**
     * <p>The name of the specification package.</p>
     * 
     * <strong>example:</strong>
     * <p>Package 1</p>
     */
    @NameInMap("SpecificationName")
    public String specificationName;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServiceInstanceShrinkRequestTag> tag;

    /**
     * <p>The template name. You must specify this parameter if the service supports multiple templates.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the service instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Trial</strong>: The service instance supports trial.</p>
     * </li>
     * <li><p><strong>NotTrial</strong>: The service instance does not support trial.</p>
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

    public CreateServiceInstanceShrinkRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
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
        /**
         * <p>Indicates whether to enable automatic payment for the order. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable automatic payment.</p>
         * </li>
         * <li><p><strong>false</strong>: Disable automatic payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        /**
         * <p>Indicates whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable.</p>
         * </li>
         * <li><p><strong>false</strong>: Disable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>302070970220</p>
         */
        @NameInMap("CouponId")
        public String couponId;

        /**
         * <p>The subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PayPeriod")
        public Long payPeriod;

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li><p><strong>Year</strong>: Year.</p>
         * </li>
         * <li><p><strong>Month</strong>: Month.</p>
         * </li>
         * <li><p><strong>Day</strong>: Day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PayPeriodUnit")
        public String payPeriodUnit;

        /**
         * <p>The ID of the private offer in Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("QuotationId")
        public String quotationId;

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

        public CreateServiceInstanceShrinkRequestCommodity setCouponId(String couponId) {
            this.couponId = couponId;
            return this;
        }
        public String getCouponId() {
            return this.couponId;
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

        public CreateServiceInstanceShrinkRequestCommodity setQuotationId(String quotationId) {
            this.quotationId = quotationId;
            return this;
        }
        public String getQuotationId() {
            return this.quotationId;
        }

    }

    public static class CreateServiceInstanceShrinkRequestOperationMetadata extends TeaModel {
        /**
         * <p>The end time of the O\&amp;M window. This parameter is valid only in managed O\&amp;M mode.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-28T06:48:56Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Additional information about the managed O\&amp;M service.</p>
         * 
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
         * <p>The list of imported resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,   &quot;Type&quot;: &quot;ResourceIds&quot;,   &quot;ResourceIds&quot;: {     &quot;ALIYUN::ECS::INSTANCE&quot;: [&quot;i-xxx&quot;, &quot;i-yyy&quot;],     &quot;ALIYUN::RDS::INSTANCE&quot;: [&quot;rm-xxx&quot;, &quot;rm-yyy&quot;],     &quot;ALIYUN::VPC::VPC&quot;: [&quot;vpc-xxx&quot;, &quot;vpc-yyy&quot;],     &quot;ALIYUN::SLB::INSTANCE&quot;: [&quot;lb-xxx&quot;, &quot;lb-yyy&quot;]   } }</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>The ID of the imported service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <p>The start time of the O\&amp;M window. This parameter is valid only in managed O\&amp;M mode.</p>
         * 
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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

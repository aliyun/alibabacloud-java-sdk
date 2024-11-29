// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information about the order placed in Alibaba Cloud Marketplace. You do not need to specify this parameter if the service is not published in Alibaba Cloud Marketplace or uses the pay-as-you-go billing method.</p>
     */
    @NameInMap("Commodity")
    public CreateServiceInstanceShrinkRequestCommodity commodity;

    /**
     * <p>The alert contact group.</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    /**
     * <p>Specifies whether to perform only a dry run for the request to check information such as the permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run for the request, but does not create a service instance.</li>
     * <li><strong>false</strong>: performs a dry run for the request, and creates a service instance if the request passes the dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the service instance supports the hosted O\&amp;M feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    /**
     * <p>Specifies whether to enable the Prometheus monitoring feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>The serviceInstance name.</p>
     * 
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operation metadata.</p>
     */
    @NameInMap("OperationMetadata")
    public CreateServiceInstanceShrinkRequestOperationMetadata operationMetadata;

    /**
     * <p>The parameters that the customer specifies to deploy the service instance.</p>
     * <blockquote>
     * <p> If region information is required to create a service instance, you must specify the region ID in the value of Parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NodeCount&quot;: 3, &quot;SystemDiskSize&quot;: 40, &quot;InstancePassword&quot;: &quot;******&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: China (Hangzhou).</li>
     * <li>ap-southeast-1: Singapore.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to automatically deduct the resource fees from the account balance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>Specification code.</p>
     * 
     * <strong>example:</strong>
     * <p>yuncode5425200001</p>
     */
    @NameInMap("SpecificationCode")
    public String specificationCode;

    /**
     * <p>The package name.</p>
     */
    @NameInMap("SpecificationName")
    public String specificationName;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServiceInstanceShrinkRequestTag> tag;

    /**
     * <p>The name of the template.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The trial type of the service instance. Valid values:</p>
     * <ul>
     * <li><strong>Trial</strong>: Trials are supported.</li>
     * <li><strong>NotTrial</strong>: Trials are not supported.</li>
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
        /**
         * <p>Specifies whether to automatically complete the payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        /**
         * <p>Specifies whether to enable auto-renewal for the service instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * <li><strong>Day</strong></li>
         * </ul>
         * 
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

    }

    public static class CreateServiceInstanceShrinkRequestOperationMetadata extends TeaModel {
        /**
         * <p>The operation end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-28T06:48:56Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The additional information.</p>
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
         * <p>Imported resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,   &quot;Type&quot;: &quot;ResourceIds&quot;,   &quot;ResourceIds&quot;: {     &quot;ALIYUN::ECS::INSTANCE&quot;: [&quot;i-xxx&quot;, &quot;i-yyy&quot;],     &quot;ALIYUN::RDS::INSTANCE&quot;: [&quot;rm-xxx&quot;, &quot;rm-yyy&quot;],     &quot;ALIYUN::VPC::VPC&quot;: [&quot;vpc-xxx&quot;, &quot;vpc-yyy&quot;],     &quot;ALIYUN::SLB::INSTANCE&quot;: [&quot;lb-xxx&quot;, &quot;lb-yyy&quot;]   } }</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <p>The operation start time.</p>
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

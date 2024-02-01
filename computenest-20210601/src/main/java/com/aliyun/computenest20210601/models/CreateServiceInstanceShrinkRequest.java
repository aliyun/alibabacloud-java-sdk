// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceShrinkRequest extends TeaModel {
    @NameInMap("BusinessInfo")
    public String businessInfoShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public CreateServiceInstanceShrinkRequestCommodity commodity;

    /**
     * <p>接收告警的云监控联系人组。</p>
     */
    @NameInMap("ContactGroup")
    public String contactGroup;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>服务实例名称。格式要求如下：</p>
     * <br>
     * <p>- 长度不超过64个字符。</p>
     * <br>
     * <p>- 必须以数字或英文字母开头，可包含数字、英文字母、短划线（-）和下划线（_）。</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OperationMetadata")
    public CreateServiceInstanceShrinkRequestOperationMetadata operationMetadata;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("SpecificationCode")
    public String specificationCode;

    /**
     * <p>套餐规格名称。</p>
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
     * <br>
     * <p>- Trial：支持试用。</p>
     * <br>
     * <p>- NotTrial：不支持试用。</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    public static CreateServiceInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceShrinkRequest self = new CreateServiceInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceShrinkRequest setBusinessInfoShrink(String businessInfoShrink) {
        this.businessInfoShrink = businessInfoShrink;
        return this;
    }
    public String getBusinessInfoShrink() {
        return this.businessInfoShrink;
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
        @NameInMap("PayPeriod")
        public Long payPeriod;

        @NameInMap("PayPeriodUnit")
        public String payPeriodUnit;

        public static CreateServiceInstanceShrinkRequestCommodity build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceShrinkRequestCommodity self = new CreateServiceInstanceShrinkRequestCommodity();
            return TeaModel.build(map, self);
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
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
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

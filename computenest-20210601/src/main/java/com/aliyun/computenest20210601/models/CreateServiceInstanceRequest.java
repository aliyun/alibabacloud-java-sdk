// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceRequest extends TeaModel {
    @NameInMap("BusinessInfo")
    public CreateServiceInstanceRequestBusinessInfo businessInfo;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public CreateServiceInstanceRequestCommodity commodity;

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
    public CreateServiceInstanceRequestOperationMetadata operationMetadata;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

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
    public java.util.List<CreateServiceInstanceRequestTag> tag;

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

    public static CreateServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceRequest self = new CreateServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceRequest setBusinessInfo(CreateServiceInstanceRequestBusinessInfo businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public CreateServiceInstanceRequestBusinessInfo getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceInstanceRequest setCommodity(CreateServiceInstanceRequestCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public CreateServiceInstanceRequestCommodity getCommodity() {
        return this.commodity;
    }

    public CreateServiceInstanceRequest setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
        return this;
    }
    public String getContactGroup() {
        return this.contactGroup;
    }

    public CreateServiceInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateServiceInstanceRequest setEnableInstanceOps(Boolean enableInstanceOps) {
        this.enableInstanceOps = enableInstanceOps;
        return this;
    }
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
    }

    public CreateServiceInstanceRequest setEnableUserPrometheus(Boolean enableUserPrometheus) {
        this.enableUserPrometheus = enableUserPrometheus;
        return this;
    }
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    public CreateServiceInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceInstanceRequest setOperationMetadata(CreateServiceInstanceRequestOperationMetadata operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public CreateServiceInstanceRequestOperationMetadata getOperationMetadata() {
        return this.operationMetadata;
    }

    public CreateServiceInstanceRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public CreateServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServiceInstanceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceInstanceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CreateServiceInstanceRequest setSpecificationCode(String specificationCode) {
        this.specificationCode = specificationCode;
        return this;
    }
    public String getSpecificationCode() {
        return this.specificationCode;
    }

    public CreateServiceInstanceRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public CreateServiceInstanceRequest setTag(java.util.List<CreateServiceInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateServiceInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateServiceInstanceRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateServiceInstanceRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

    public static class CreateServiceInstanceRequestBusinessInfo extends TeaModel {
        @NameInMap("OrderParams")
        public java.util.Map<String, String> orderParams;

        public static CreateServiceInstanceRequestBusinessInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceRequestBusinessInfo self = new CreateServiceInstanceRequestBusinessInfo();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceRequestBusinessInfo setOrderParams(java.util.Map<String, String> orderParams) {
            this.orderParams = orderParams;
            return this;
        }
        public java.util.Map<String, String> getOrderParams() {
            return this.orderParams;
        }

    }

    public static class CreateServiceInstanceRequestCommodity extends TeaModel {
        @NameInMap("PayPeriod")
        public Long payPeriod;

        @NameInMap("PayPeriodUnit")
        public String payPeriodUnit;

        public static CreateServiceInstanceRequestCommodity build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceRequestCommodity self = new CreateServiceInstanceRequestCommodity();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceRequestCommodity setPayPeriod(Long payPeriod) {
            this.payPeriod = payPeriod;
            return this;
        }
        public Long getPayPeriod() {
            return this.payPeriod;
        }

        public CreateServiceInstanceRequestCommodity setPayPeriodUnit(String payPeriodUnit) {
            this.payPeriodUnit = payPeriodUnit;
            return this;
        }
        public String getPayPeriodUnit() {
            return this.payPeriodUnit;
        }

    }

    public static class CreateServiceInstanceRequestOperationMetadata extends TeaModel {
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

        public static CreateServiceInstanceRequestOperationMetadata build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceRequestOperationMetadata self = new CreateServiceInstanceRequestOperationMetadata();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceRequestOperationMetadata setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateServiceInstanceRequestOperationMetadata setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public CreateServiceInstanceRequestOperationMetadata setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public CreateServiceInstanceRequestOperationMetadata setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public CreateServiceInstanceRequestOperationMetadata setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateServiceInstanceRequestTag extends TeaModel {
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

        public static CreateServiceInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceRequestTag self = new CreateServiceInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

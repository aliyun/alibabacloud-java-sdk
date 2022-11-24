// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ContactGroup")
    public String contactGroup;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperationMetadata")
    public CreateServiceInstanceRequestOperationMetadata operationMetadata;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("PayType")
    public Long payType;

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

    @NameInMap("SpecificationName")
    public String specificationName;

    @NameInMap("Tag")
    public java.util.List<CreateServiceInstanceRequestTag> tag;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TrialType")
    public String trialType;

    public static CreateServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceRequest self = new CreateServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CreateServiceInstanceRequest setPayType(Long payType) {
        this.payType = payType;
        return this;
    }
    public Long getPayType() {
        return this.payType;
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

    public static class CreateServiceInstanceRequestOperationMetadata extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

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
        @NameInMap("Key")
        public String key;

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

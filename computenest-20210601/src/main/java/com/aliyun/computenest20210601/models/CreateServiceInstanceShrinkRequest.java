// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnableAccountOps")
    public Boolean enableAccountOps;

    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    @NameInMap("OperationMetadata")
    public CreateServiceInstanceShrinkRequestOperationMetadata operationMetadata;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestTag")
    public java.util.List<CreateServiceInstanceShrinkRequestRequestTag> requestTag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("TemplateName")
    public String templateName;

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

    public CreateServiceInstanceShrinkRequest setEnableAccountOps(Boolean enableAccountOps) {
        this.enableAccountOps = enableAccountOps;
        return this;
    }
    public Boolean getEnableAccountOps() {
        return this.enableAccountOps;
    }

    public CreateServiceInstanceShrinkRequest setEnableInstanceOps(Boolean enableInstanceOps) {
        this.enableInstanceOps = enableInstanceOps;
        return this;
    }
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
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

    public CreateServiceInstanceShrinkRequest setRequestTag(java.util.List<CreateServiceInstanceShrinkRequestRequestTag> requestTag) {
        this.requestTag = requestTag;
        return this;
    }
    public java.util.List<CreateServiceInstanceShrinkRequestRequestTag> getRequestTag() {
        return this.requestTag;
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

    public CreateServiceInstanceShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class CreateServiceInstanceShrinkRequestOperationMetadata extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

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

    public static class CreateServiceInstanceShrinkRequestRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateServiceInstanceShrinkRequestRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceShrinkRequestRequestTag self = new CreateServiceInstanceShrinkRequestRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceShrinkRequestRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceInstanceShrinkRequestRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

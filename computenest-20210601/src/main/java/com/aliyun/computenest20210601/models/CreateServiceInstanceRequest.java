// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    @NameInMap("EnableAccountOps")
    public Boolean enableAccountOps;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("OperationMetadata")
    public CreateServiceInstanceRequestOperationMetadata operationMetadata;

    @NameInMap("RequestTags")
    public java.util.List<CreateServiceInstanceRequestRequestTags> requestTags;

    public static CreateServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceRequest self = new CreateServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public CreateServiceInstanceRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public CreateServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceInstanceRequest setEnableInstanceOps(Boolean enableInstanceOps) {
        this.enableInstanceOps = enableInstanceOps;
        return this;
    }
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
    }

    public CreateServiceInstanceRequest setEnableAccountOps(Boolean enableAccountOps) {
        this.enableAccountOps = enableAccountOps;
        return this;
    }
    public Boolean getEnableAccountOps() {
        return this.enableAccountOps;
    }

    public CreateServiceInstanceRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateServiceInstanceRequest setOperationMetadata(CreateServiceInstanceRequestOperationMetadata operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public CreateServiceInstanceRequestOperationMetadata getOperationMetadata() {
        return this.operationMetadata;
    }

    public CreateServiceInstanceRequest setRequestTags(java.util.List<CreateServiceInstanceRequestRequestTags> requestTags) {
        this.requestTags = requestTags;
        return this;
    }
    public java.util.List<CreateServiceInstanceRequestRequestTags> getRequestTags() {
        return this.requestTags;
    }

    public static class CreateServiceInstanceRequestOperationMetadata extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        public static CreateServiceInstanceRequestOperationMetadata build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceRequestOperationMetadata self = new CreateServiceInstanceRequestOperationMetadata();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceRequestOperationMetadata setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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

    }

    public static class CreateServiceInstanceRequestRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateServiceInstanceRequestRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceInstanceRequestRequestTags self = new CreateServiceInstanceRequestRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateServiceInstanceRequestRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServiceInstanceRequestRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

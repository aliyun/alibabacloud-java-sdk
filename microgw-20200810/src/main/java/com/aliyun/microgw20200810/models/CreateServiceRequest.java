// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    // ServiceCreateDTO
    @NameInMap("data")
    public CreateServiceRequestData data;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setData(CreateServiceRequestData data) {
        this.data = data;
        return this;
    }
    public CreateServiceRequestData getData() {
        return this.data;
    }

    public static class CreateServiceRequestData extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // description
        @NameInMap("description")
        public String description;

        // isAutoRefresh
        @NameInMap("isAutoRefresh")
        public Boolean isAutoRefresh;

        // metaInfo
        @NameInMap("metaInfo")
        public java.util.List<String> metaInfo;

        // name
        @NameInMap("name")
        public String name;

        // registryId
        @NameInMap("registryId")
        public Long registryId;

        // serviceEnds
        @NameInMap("serviceEnds")
        public java.util.List<String> serviceEnds;

        // serviceNameInRegistry
        @NameInMap("serviceNameInRegistry")
        public String serviceNameInRegistry;

        // sourceType
        @NameInMap("sourceType")
        public Long sourceType;

        public static CreateServiceRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRequestData self = new CreateServiceRequestData();
            return TeaModel.build(map, self);
        }

        public CreateServiceRequestData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreateServiceRequestData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateServiceRequestData setIsAutoRefresh(Boolean isAutoRefresh) {
            this.isAutoRefresh = isAutoRefresh;
            return this;
        }
        public Boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        public CreateServiceRequestData setMetaInfo(java.util.List<String> metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public java.util.List<String> getMetaInfo() {
            return this.metaInfo;
        }

        public CreateServiceRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceRequestData setRegistryId(Long registryId) {
            this.registryId = registryId;
            return this;
        }
        public Long getRegistryId() {
            return this.registryId;
        }

        public CreateServiceRequestData setServiceEnds(java.util.List<String> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<String> getServiceEnds() {
            return this.serviceEnds;
        }

        public CreateServiceRequestData setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public CreateServiceRequestData setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

    }

}

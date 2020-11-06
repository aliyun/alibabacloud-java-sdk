// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
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

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceRequest setIsAutoRefresh(Boolean isAutoRefresh) {
        this.isAutoRefresh = isAutoRefresh;
        return this;
    }
    public Boolean getIsAutoRefresh() {
        return this.isAutoRefresh;
    }

    public CreateServiceRequest setMetaInfo(java.util.List<String> metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public java.util.List<String> getMetaInfo() {
        return this.metaInfo;
    }

    public CreateServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

    public CreateServiceRequest setServiceEnds(java.util.List<String> serviceEnds) {
        this.serviceEnds = serviceEnds;
        return this;
    }
    public java.util.List<String> getServiceEnds() {
        return this.serviceEnds;
    }

    public CreateServiceRequest setServiceNameInRegistry(String serviceNameInRegistry) {
        this.serviceNameInRegistry = serviceNameInRegistry;
        return this;
    }
    public String getServiceNameInRegistry() {
        return this.serviceNameInRegistry;
    }

    public CreateServiceRequest setSourceType(Long sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Long getSourceType() {
        return this.sourceType;
    }

}

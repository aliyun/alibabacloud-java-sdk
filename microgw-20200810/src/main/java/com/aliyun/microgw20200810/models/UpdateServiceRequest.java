// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    // aliasName
    @NameInMap("aliasName")
    public String aliasName;

    // creationDateTime
    @NameInMap("creationDateTime")
    public String creationDateTime;

    // description
    @NameInMap("description")
    public String description;

    // id
    @NameInMap("id")
    public Long id;

    // isAutoRefresh
    @NameInMap("isAutoRefresh")
    public Boolean isAutoRefresh;

    // isHealth
    @NameInMap("isHealth")
    public Boolean isHealth;

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

    // updateDateTime
    @NameInMap("updateDateTime")
    public String updateDateTime;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateServiceRequest setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public UpdateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateServiceRequest setIsAutoRefresh(Boolean isAutoRefresh) {
        this.isAutoRefresh = isAutoRefresh;
        return this;
    }
    public Boolean getIsAutoRefresh() {
        return this.isAutoRefresh;
    }

    public UpdateServiceRequest setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
        return this;
    }
    public Boolean getIsHealth() {
        return this.isHealth;
    }

    public UpdateServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateServiceRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

    public UpdateServiceRequest setServiceEnds(java.util.List<String> serviceEnds) {
        this.serviceEnds = serviceEnds;
        return this;
    }
    public java.util.List<String> getServiceEnds() {
        return this.serviceEnds;
    }

    public UpdateServiceRequest setServiceNameInRegistry(String serviceNameInRegistry) {
        this.serviceNameInRegistry = serviceNameInRegistry;
        return this;
    }
    public String getServiceNameInRegistry() {
        return this.serviceNameInRegistry;
    }

    public UpdateServiceRequest setSourceType(Long sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Long getSourceType() {
        return this.sourceType;
    }

    public UpdateServiceRequest setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }
    public String getUpdateDateTime() {
        return this.updateDateTime;
    }

}

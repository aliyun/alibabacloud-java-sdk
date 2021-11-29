// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class PutProductInstanceConfigRequest extends TeaModel {
    @NameInMap("componentUID")
    public String componentUID;

    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    @NameInMap("configUID")
    public String configUID;

    @NameInMap("description")
    public String description;

    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("name")
    public String name;

    @NameInMap("parentComponentName")
    public String parentComponentName;

    @NameInMap("parentComponentVersionUID")
    public String parentComponentVersionUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("releaseName")
    public String releaseName;

    @NameInMap("scope")
    public java.util.List<String> scope;

    @NameInMap("value")
    public String value;

    public static PutProductInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProductInstanceConfigRequest self = new PutProductInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutProductInstanceConfigRequest setComponentUID(String componentUID) {
        this.componentUID = componentUID;
        return this;
    }
    public String getComponentUID() {
        return this.componentUID;
    }

    public PutProductInstanceConfigRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public PutProductInstanceConfigRequest setConfigUID(String configUID) {
        this.configUID = configUID;
        return this;
    }
    public String getConfigUID() {
        return this.configUID;
    }

    public PutProductInstanceConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutProductInstanceConfigRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public PutProductInstanceConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PutProductInstanceConfigRequest setParentComponentName(String parentComponentName) {
        this.parentComponentName = parentComponentName;
        return this;
    }
    public String getParentComponentName() {
        return this.parentComponentName;
    }

    public PutProductInstanceConfigRequest setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    public PutProductInstanceConfigRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public PutProductInstanceConfigRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public PutProductInstanceConfigRequest setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

    public PutProductInstanceConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

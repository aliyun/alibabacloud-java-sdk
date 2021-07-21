// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class SaveEnvironmentParamRequest extends TeaModel {
    @NameInMap("componentUID")
    public String componentUID;

    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    @NameInMap("name")
    public String name;

    @NameInMap("paramUID")
    public String paramUID;

    @NameInMap("provider")
    public String provider;

    @NameInMap("releaseName")
    public String releaseName;

    @NameInMap("scope")
    public java.util.List<String> scope;

    @NameInMap("value")
    public String value;

    @NameInMap("notes")
    public String notes;

    @NameInMap("ProductVersionUID")
    public String productVersionUID;

    public static SaveEnvironmentParamRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveEnvironmentParamRequest self = new SaveEnvironmentParamRequest();
        return TeaModel.build(map, self);
    }

    public SaveEnvironmentParamRequest setComponentUID(String componentUID) {
        this.componentUID = componentUID;
        return this;
    }
    public String getComponentUID() {
        return this.componentUID;
    }

    public SaveEnvironmentParamRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public SaveEnvironmentParamRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveEnvironmentParamRequest setParamUID(String paramUID) {
        this.paramUID = paramUID;
        return this;
    }
    public String getParamUID() {
        return this.paramUID;
    }

    public SaveEnvironmentParamRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public SaveEnvironmentParamRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public SaveEnvironmentParamRequest setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

    public SaveEnvironmentParamRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public SaveEnvironmentParamRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public SaveEnvironmentParamRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}

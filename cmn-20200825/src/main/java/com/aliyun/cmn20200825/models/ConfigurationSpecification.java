// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ConfigurationSpecification extends TeaModel {
    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("ConfigurationSpecificationId")
    public String configurationSpecificationId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Model")
    public String model;

    @NameInMap("RelatedVariate")
    public java.util.List<String> relatedVariate;

    @NameInMap("Role")
    public String role;

    @NameInMap("SpecificationContent")
    public String specificationContent;

    @NameInMap("SpecificationName")
    public String specificationName;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Vendor")
    public String vendor;

    public static ConfigurationSpecification build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationSpecification self = new ConfigurationSpecification();
        return TeaModel.build(map, self);
    }

    public ConfigurationSpecification setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public ConfigurationSpecification setConfigurationSpecificationId(String configurationSpecificationId) {
        this.configurationSpecificationId = configurationSpecificationId;
        return this;
    }
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    public ConfigurationSpecification setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ConfigurationSpecification setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ConfigurationSpecification setRelatedVariate(java.util.List<String> relatedVariate) {
        this.relatedVariate = relatedVariate;
        return this;
    }
    public java.util.List<String> getRelatedVariate() {
        return this.relatedVariate;
    }

    public ConfigurationSpecification setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ConfigurationSpecification setSpecificationContent(String specificationContent) {
        this.specificationContent = specificationContent;
        return this;
    }
    public String getSpecificationContent() {
        return this.specificationContent;
    }

    public ConfigurationSpecification setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public ConfigurationSpecification setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ConfigurationSpecification setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}

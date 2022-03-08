// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ConfigurationSpecification extends TeaModel {
    // 架构类型
    @NameInMap("Architecture")
    public String architecture;

    // 配置规范uid
    @NameInMap("ConfigurationSpecificationId")
    public String configurationSpecificationId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 型号
    @NameInMap("Model")
    public String model;

    // 相关变量
    @NameInMap("RelatedVariate")
    public java.util.List<String> relatedVariate;

    // 角色
    @NameInMap("Role")
    public String role;

    // 配置规范内容
    @NameInMap("SpecificationContent")
    public String specificationContent;

    // 配置规范名字
    @NameInMap("SpecificationName")
    public String specificationName;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 厂商
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationSpecificationRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 配置规范名字
    @NameInMap("SpecificationName")
    public String specificationName;

    // 配置规范id
    @NameInMap("ConfigurationSpecificationId")
    public String configurationSpecificationId;

    // 架构类型
    @NameInMap("Architecture")
    public String architecture;

    // 角色
    @NameInMap("Role")
    public String role;

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    // 型号
    @NameInMap("Model")
    public String model;

    // 配置规范内容
    @NameInMap("SpecificationContent")
    public String specificationContent;

    // 相关变量
    @NameInMap("RelatedVariate")
    public java.util.List<byte[]> relatedVariate;

    public static UpdateConfigurationSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationSpecificationRequest self = new UpdateConfigurationSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationSpecificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConfigurationSpecificationRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public UpdateConfigurationSpecificationRequest setConfigurationSpecificationId(String configurationSpecificationId) {
        this.configurationSpecificationId = configurationSpecificationId;
        return this;
    }
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    public UpdateConfigurationSpecificationRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public UpdateConfigurationSpecificationRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateConfigurationSpecificationRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public UpdateConfigurationSpecificationRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateConfigurationSpecificationRequest setSpecificationContent(String specificationContent) {
        this.specificationContent = specificationContent;
        return this;
    }
    public String getSpecificationContent() {
        return this.specificationContent;
    }

    public UpdateConfigurationSpecificationRequest setRelatedVariate(java.util.List<byte[]> relatedVariate) {
        this.relatedVariate = relatedVariate;
        return this;
    }
    public java.util.List<byte[]> getRelatedVariate() {
        return this.relatedVariate;
    }

}

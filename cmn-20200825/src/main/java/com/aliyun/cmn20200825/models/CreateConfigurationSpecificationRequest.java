// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationSpecificationRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 配置规范名字
    @NameInMap("SpecificationName")
    public String specificationName;

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

    public static CreateConfigurationSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationSpecificationRequest self = new CreateConfigurationSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationSpecificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateConfigurationSpecificationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConfigurationSpecificationRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public CreateConfigurationSpecificationRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateConfigurationSpecificationRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateConfigurationSpecificationRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public CreateConfigurationSpecificationRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateConfigurationSpecificationRequest setSpecificationContent(String specificationContent) {
        this.specificationContent = specificationContent;
        return this;
    }
    public String getSpecificationContent() {
        return this.specificationContent;
    }

    public CreateConfigurationSpecificationRequest setRelatedVariate(java.util.List<byte[]> relatedVariate) {
        this.relatedVariate = relatedVariate;
        return this;
    }
    public java.util.List<byte[]> getRelatedVariate() {
        return this.relatedVariate;
    }

}

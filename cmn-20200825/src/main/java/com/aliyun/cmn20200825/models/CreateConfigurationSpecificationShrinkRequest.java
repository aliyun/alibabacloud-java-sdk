// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationSpecificationShrinkRequest extends TeaModel {
    // 架构类型
    @NameInMap("Architecture")
    public String architecture;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 型号
    @NameInMap("Model")
    public String model;

    // 相关变量
    @NameInMap("RelatedVariate")
    public String relatedVariateShrink;

    // 角色
    @NameInMap("Role")
    public String role;

    // 配置规范内容
    @NameInMap("SpecificationContent")
    public String specificationContent;

    // 配置规范名字
    @NameInMap("SpecificationName")
    public String specificationName;

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    public static CreateConfigurationSpecificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationSpecificationShrinkRequest self = new CreateConfigurationSpecificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationSpecificationShrinkRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateConfigurationSpecificationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConfigurationSpecificationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateConfigurationSpecificationShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateConfigurationSpecificationShrinkRequest setRelatedVariateShrink(String relatedVariateShrink) {
        this.relatedVariateShrink = relatedVariateShrink;
        return this;
    }
    public String getRelatedVariateShrink() {
        return this.relatedVariateShrink;
    }

    public CreateConfigurationSpecificationShrinkRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateConfigurationSpecificationShrinkRequest setSpecificationContent(String specificationContent) {
        this.specificationContent = specificationContent;
        return this;
    }
    public String getSpecificationContent() {
        return this.specificationContent;
    }

    public CreateConfigurationSpecificationShrinkRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public CreateConfigurationSpecificationShrinkRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationSpecificationShrinkRequest extends TeaModel {
    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("ConfigurationSpecificationId")
    public String configurationSpecificationId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Model")
    public String model;

    @NameInMap("RelatedVariate")
    public String relatedVariateShrink;

    @NameInMap("Role")
    public String role;

    @NameInMap("SpecificationContent")
    public String specificationContent;

    @NameInMap("SpecificationName")
    public String specificationName;

    @NameInMap("Vendor")
    public String vendor;

    public static UpdateConfigurationSpecificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationSpecificationShrinkRequest self = new UpdateConfigurationSpecificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationSpecificationShrinkRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public UpdateConfigurationSpecificationShrinkRequest setConfigurationSpecificationId(String configurationSpecificationId) {
        this.configurationSpecificationId = configurationSpecificationId;
        return this;
    }
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    public UpdateConfigurationSpecificationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConfigurationSpecificationShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateConfigurationSpecificationShrinkRequest setRelatedVariateShrink(String relatedVariateShrink) {
        this.relatedVariateShrink = relatedVariateShrink;
        return this;
    }
    public String getRelatedVariateShrink() {
        return this.relatedVariateShrink;
    }

    public UpdateConfigurationSpecificationShrinkRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateConfigurationSpecificationShrinkRequest setSpecificationContent(String specificationContent) {
        this.specificationContent = specificationContent;
        return this;
    }
    public String getSpecificationContent() {
        return this.specificationContent;
    }

    public UpdateConfigurationSpecificationShrinkRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public UpdateConfigurationSpecificationShrinkRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}

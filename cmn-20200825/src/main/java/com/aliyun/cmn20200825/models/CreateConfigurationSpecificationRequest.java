// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationSpecificationRequest extends TeaModel {
    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Model")
    public String model;

    @NameInMap("RelatedVariate")
    public java.util.List<byte[]> relatedVariate;

    @NameInMap("Role")
    public String role;

    @NameInMap("SpecificationContent")
    public String specificationContent;

    @NameInMap("SpecificationName")
    public String specificationName;

    @NameInMap("Vendor")
    public String vendor;

    public static CreateConfigurationSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationSpecificationRequest self = new CreateConfigurationSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationSpecificationRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateConfigurationSpecificationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConfigurationSpecificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateConfigurationSpecificationRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateConfigurationSpecificationRequest setRelatedVariate(java.util.List<byte[]> relatedVariate) {
        this.relatedVariate = relatedVariate;
        return this;
    }
    public java.util.List<byte[]> getRelatedVariate() {
        return this.relatedVariate;
    }

    public CreateConfigurationSpecificationRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateConfigurationSpecificationRequest setSpecificationContent(String specificationContent) {
        this.specificationContent = specificationContent;
        return this;
    }
    public String getSpecificationContent() {
        return this.specificationContent;
    }

    public CreateConfigurationSpecificationRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public CreateConfigurationSpecificationRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}

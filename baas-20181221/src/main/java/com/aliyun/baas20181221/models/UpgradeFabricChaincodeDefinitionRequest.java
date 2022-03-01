// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeDefinitionRequest extends TeaModel {
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    @NameInMap("ChaincodeVersion")
    public String chaincodeVersion;

    @NameInMap("CollectionConfig")
    public String collectionConfig;

    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    @NameInMap("InitRequired")
    public Boolean initRequired;

    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static UpgradeFabricChaincodeDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeDefinitionRequest self = new UpgradeFabricChaincodeDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeDefinitionRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public UpgradeFabricChaincodeDefinitionRequest setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public UpgradeFabricChaincodeDefinitionRequest setChaincodeVersion(String chaincodeVersion) {
        this.chaincodeVersion = chaincodeVersion;
        return this;
    }
    public String getChaincodeVersion() {
        return this.chaincodeVersion;
    }

    public UpgradeFabricChaincodeDefinitionRequest setCollectionConfig(String collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }
    public String getCollectionConfig() {
        return this.collectionConfig;
    }

    public UpgradeFabricChaincodeDefinitionRequest setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public UpgradeFabricChaincodeDefinitionRequest setInitRequired(Boolean initRequired) {
        this.initRequired = initRequired;
        return this;
    }
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    public UpgradeFabricChaincodeDefinitionRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpgradeFabricChaincodeDefinitionRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

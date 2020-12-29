// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    @NameInMap("Location")
    public String location;

    @NameInMap("CollectionConfig")
    public String collectionConfig;

    public static UpgradeFabricChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeRequest self = new UpgradeFabricChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UpgradeFabricChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public UpgradeFabricChaincodeRequest setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public UpgradeFabricChaincodeRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpgradeFabricChaincodeRequest setCollectionConfig(String collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }
    public String getCollectionConfig() {
        return this.collectionConfig;
    }

}

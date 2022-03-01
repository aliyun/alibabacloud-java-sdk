// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class InstantiateFabricChaincodeRequest extends TeaModel {
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("CollectionConfig")
    public String collectionConfig;

    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static InstantiateFabricChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        InstantiateFabricChaincodeRequest self = new InstantiateFabricChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public InstantiateFabricChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public InstantiateFabricChaincodeRequest setCollectionConfig(String collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }
    public String getCollectionConfig() {
        return this.collectionConfig;
    }

    public InstantiateFabricChaincodeRequest setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public InstantiateFabricChaincodeRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public InstantiateFabricChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

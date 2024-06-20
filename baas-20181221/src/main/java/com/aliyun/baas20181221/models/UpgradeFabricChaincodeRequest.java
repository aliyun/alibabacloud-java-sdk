// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-sacc-fk9z4r97****</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;requiredPeerCount&quot;:0,&quot;name&quot;:&quot;collectionName&quot;,&quot;maxPeerCount&quot;:3,&quot;blockToLive&quot;:0,&quot;policy&quot;:&quot;OR(\&quot;Org1MSP.peer\&quot;)&quot;}]</p>
     */
    @NameInMap("CollectionConfig")
    public String collectionConfig;

    /**
     * <strong>example:</strong>
     * <p>OR (&quot;wholesalerMSP.peer&quot;)</p>
     */
    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-wholesaler-15ix77tof****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static UpgradeFabricChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeRequest self = new UpgradeFabricChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public UpgradeFabricChaincodeRequest setCollectionConfig(String collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }
    public String getCollectionConfig() {
        return this.collectionConfig;
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

    public UpgradeFabricChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

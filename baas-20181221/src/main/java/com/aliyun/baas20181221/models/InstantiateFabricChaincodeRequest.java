// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class InstantiateFabricChaincodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-198jejf8f8****</p>
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
     * <p>OR (&#39;perf9141MSP.member&#39;)</p>
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
     * <p>peers-aaaaaa2-1eqnj5o5w****</p>
     */
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

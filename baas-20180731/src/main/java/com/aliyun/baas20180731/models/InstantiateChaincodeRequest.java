// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InstantiateChaincodeRequest extends TeaModel {
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
     * <p>string</p>
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

    public static InstantiateChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        InstantiateChaincodeRequest self = new InstantiateChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public InstantiateChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public InstantiateChaincodeRequest setCollectionConfig(String collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }
    public String getCollectionConfig() {
        return this.collectionConfig;
    }

    public InstantiateChaincodeRequest setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public InstantiateChaincodeRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public InstantiateChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

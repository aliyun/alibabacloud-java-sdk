// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class SubmitFabricChaincodeDefinitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sacc_v1.0:698d4e73c5f1d0239fbf0313ac79ddfaf44d5a803ecb02a4d1983cca4a706860</p>
     */
    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ChaincodeVersion")
    public String chaincodeVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chan-channelx-1l1hmckuuisxo</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>collectionconfig</p>
     */
    @NameInMap("CollectionConfig")
    public String collectionConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OR (&quot;perf9141MSP.member&quot;)</p>
     */
    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitRequired")
    public Boolean initRequired;

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
     * <p>sacc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static SubmitFabricChaincodeDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFabricChaincodeDefinitionRequest self = new SubmitFabricChaincodeDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFabricChaincodeDefinitionRequest setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public SubmitFabricChaincodeDefinitionRequest setChaincodeVersion(String chaincodeVersion) {
        this.chaincodeVersion = chaincodeVersion;
        return this;
    }
    public String getChaincodeVersion() {
        return this.chaincodeVersion;
    }

    public SubmitFabricChaincodeDefinitionRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SubmitFabricChaincodeDefinitionRequest setCollectionConfig(String collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }
    public String getCollectionConfig() {
        return this.collectionConfig;
    }

    public SubmitFabricChaincodeDefinitionRequest setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public SubmitFabricChaincodeDefinitionRequest setInitRequired(Boolean initRequired) {
        this.initRequired = initRequired;
        return this;
    }
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    public SubmitFabricChaincodeDefinitionRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public SubmitFabricChaincodeDefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitFabricChaincodeDefinitionRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}

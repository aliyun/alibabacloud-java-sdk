// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SubmitFabricChaincodeDefinitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChaincodeVersion")
    public String chaincodeVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CollectionConfig")
    public String collectionConfig;

    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    @NameInMap("InitRequired")
    public Boolean initRequired;

    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
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

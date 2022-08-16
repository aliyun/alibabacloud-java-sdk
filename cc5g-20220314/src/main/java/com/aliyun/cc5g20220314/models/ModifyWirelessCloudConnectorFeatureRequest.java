// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ModifyWirelessCloudConnectorFeatureRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("FeatureName")
    public String featureName;

    @NameInMap("FeatureValue")
    public String featureValue;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static ModifyWirelessCloudConnectorFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWirelessCloudConnectorFeatureRequest self = new ModifyWirelessCloudConnectorFeatureRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWirelessCloudConnectorFeatureRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyWirelessCloudConnectorFeatureRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyWirelessCloudConnectorFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public ModifyWirelessCloudConnectorFeatureRequest setFeatureValue(String featureValue) {
        this.featureValue = featureValue;
        return this;
    }
    public String getFeatureValue() {
        return this.featureValue;
    }

    public ModifyWirelessCloudConnectorFeatureRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}

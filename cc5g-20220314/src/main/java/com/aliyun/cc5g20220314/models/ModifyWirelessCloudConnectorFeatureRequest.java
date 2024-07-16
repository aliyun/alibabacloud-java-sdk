// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ModifyWirelessCloudConnectorFeatureRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TF-******-1633255280-43c94bf7-2dd3-4c14-8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>DirectMode</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <strong>example:</strong>
     * <p>On</p>
     */
    @NameInMap("FeatureValue")
    public String featureValue;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
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

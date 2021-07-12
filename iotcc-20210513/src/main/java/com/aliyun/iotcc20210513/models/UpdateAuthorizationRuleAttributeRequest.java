// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleAttributeRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("SourceCidrs")
    public java.util.List<String> sourceCidrs;

    @NameInMap("AuthorizationRuleName")
    public String authorizationRuleName;

    @NameInMap("AuthorizationRuleDescription")
    public String authorizationRuleDescription;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAuthorizationRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleAttributeRequest self = new UpdateAuthorizationRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleAttributeRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public UpdateAuthorizationRuleAttributeRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateAuthorizationRuleAttributeRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public UpdateAuthorizationRuleAttributeRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public UpdateAuthorizationRuleAttributeRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UpdateAuthorizationRuleAttributeRequest setSourceCidrs(java.util.List<String> sourceCidrs) {
        this.sourceCidrs = sourceCidrs;
        return this;
    }
    public java.util.List<String> getSourceCidrs() {
        return this.sourceCidrs;
    }

    public UpdateAuthorizationRuleAttributeRequest setAuthorizationRuleName(String authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public UpdateAuthorizationRuleAttributeRequest setAuthorizationRuleDescription(String authorizationRuleDescription) {
        this.authorizationRuleDescription = authorizationRuleDescription;
        return this;
    }
    public String getAuthorizationRuleDescription() {
        return this.authorizationRuleDescription;
    }

    public UpdateAuthorizationRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAuthorizationRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateAuthorizationRuleAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

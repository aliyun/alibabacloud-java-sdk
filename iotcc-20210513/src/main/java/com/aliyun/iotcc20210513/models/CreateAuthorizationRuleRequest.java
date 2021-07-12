// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

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

    public static CreateAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRuleRequest self = new CreateAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRuleRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateAuthorizationRuleRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateAuthorizationRuleRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateAuthorizationRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateAuthorizationRuleRequest setSourceCidrs(java.util.List<String> sourceCidrs) {
        this.sourceCidrs = sourceCidrs;
        return this;
    }
    public java.util.List<String> getSourceCidrs() {
        return this.sourceCidrs;
    }

    public CreateAuthorizationRuleRequest setAuthorizationRuleName(String authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public CreateAuthorizationRuleRequest setAuthorizationRuleDescription(String authorizationRuleDescription) {
        this.authorizationRuleDescription = authorizationRuleDescription;
        return this;
    }
    public String getAuthorizationRuleDescription() {
        return this.authorizationRuleDescription;
    }

    public CreateAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAuthorizationRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAuthorizationRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

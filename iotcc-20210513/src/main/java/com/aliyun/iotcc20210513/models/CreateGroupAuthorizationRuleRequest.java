// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupAuthorizationRuleRequest extends TeaModel {
    @NameInMap("AuthorizationRuleDescription")
    public String authorizationRuleDescription;

    @NameInMap("AuthorizationRuleName")
    public String authorizationRuleName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceCidrs")
    public java.util.List<String> sourceCidrs;

    public static CreateGroupAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupAuthorizationRuleRequest self = new CreateGroupAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupAuthorizationRuleRequest setAuthorizationRuleDescription(String authorizationRuleDescription) {
        this.authorizationRuleDescription = authorizationRuleDescription;
        return this;
    }
    public String getAuthorizationRuleDescription() {
        return this.authorizationRuleDescription;
    }

    public CreateGroupAuthorizationRuleRequest setAuthorizationRuleName(String authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public CreateGroupAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGroupAuthorizationRuleRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateGroupAuthorizationRuleRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateGroupAuthorizationRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateGroupAuthorizationRuleRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public CreateGroupAuthorizationRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateGroupAuthorizationRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGroupAuthorizationRuleRequest setSourceCidrs(java.util.List<String> sourceCidrs) {
        this.sourceCidrs = sourceCidrs;
        return this;
    }
    public java.util.List<String> getSourceCidrs() {
        return this.sourceCidrs;
    }

}

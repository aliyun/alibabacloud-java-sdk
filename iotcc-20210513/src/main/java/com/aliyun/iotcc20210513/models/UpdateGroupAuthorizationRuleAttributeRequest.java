// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupAuthorizationRuleAttributeRequest extends TeaModel {
    @NameInMap("AuthorizationRuleDescription")
    public String authorizationRuleDescription;

    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

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

    public static UpdateGroupAuthorizationRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupAuthorizationRuleAttributeRequest self = new UpdateGroupAuthorizationRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setAuthorizationRuleDescription(String authorizationRuleDescription) {
        this.authorizationRuleDescription = authorizationRuleDescription;
        return this;
    }
    public String getAuthorizationRuleDescription() {
        return this.authorizationRuleDescription;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setAuthorizationRuleName(String authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateGroupAuthorizationRuleAttributeRequest setSourceCidrs(java.util.List<String> sourceCidrs) {
        this.sourceCidrs = sourceCidrs;
        return this;
    }
    public java.util.List<String> getSourceCidrs() {
        return this.sourceCidrs;
    }

}

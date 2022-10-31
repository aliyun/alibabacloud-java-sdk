// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateGroupAuthorizationRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationPort")
    public String destinationPort;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Name")
    public String name;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("SourceCidr")
    public String sourceCidr;

    @NameInMap("WirelessCloudConnectorGroupId")
    public String wirelessCloudConnectorGroupId;

    public static CreateGroupAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupAuthorizationRuleRequest self = new CreateGroupAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGroupAuthorizationRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupAuthorizationRuleRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateGroupAuthorizationRuleRequest setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }
    public String getDestinationPort() {
        return this.destinationPort;
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

    public CreateGroupAuthorizationRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupAuthorizationRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateGroupAuthorizationRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateGroupAuthorizationRuleRequest setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public CreateGroupAuthorizationRuleRequest setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
        this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
        return this;
    }
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

}

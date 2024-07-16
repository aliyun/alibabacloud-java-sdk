// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateGroupAuthorizationRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TF-******-1633255280-43c94bf7-2dd3-4c14-8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>ar5gg-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>106.14.175.4</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <strong>example:</strong>
     * <p>-1/-1</p>
     */
    @NameInMap("DestinationPort")
    public String destinationPort;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cidr</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Permit</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5gg-****</p>
     */
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

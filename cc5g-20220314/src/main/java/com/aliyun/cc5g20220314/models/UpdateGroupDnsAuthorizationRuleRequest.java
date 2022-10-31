// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateGroupDnsAuthorizationRuleRequest extends TeaModel {
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DestinationIp")
    public String destinationIp;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Name")
    public String name;

    @NameInMap("SourceDNSIp")
    public String sourceDNSIp;

    @NameInMap("WirelessCloudConnectorGroupId")
    public String wirelessCloudConnectorGroupId;

    public static UpdateGroupDnsAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDnsAuthorizationRuleRequest self = new UpdateGroupDnsAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDnsAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateGroupDnsAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateGroupDnsAuthorizationRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGroupDnsAuthorizationRuleRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public UpdateGroupDnsAuthorizationRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateGroupDnsAuthorizationRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGroupDnsAuthorizationRuleRequest setSourceDNSIp(String sourceDNSIp) {
        this.sourceDNSIp = sourceDNSIp;
        return this;
    }
    public String getSourceDNSIp() {
        return this.sourceDNSIp;
    }

    public UpdateGroupDnsAuthorizationRuleRequest setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
        this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
        return this;
    }
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

}

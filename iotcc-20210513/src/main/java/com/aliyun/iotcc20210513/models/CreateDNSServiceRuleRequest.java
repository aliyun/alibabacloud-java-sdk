// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateDNSServiceRuleRequest extends TeaModel {
    @NameInMap("AuthorizationRuleDescription")
    public String authorizationRuleDescription;

    @NameInMap("AuthorizationRuleName")
    public String authorizationRuleName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Source")
    public String source;

    public static CreateDNSServiceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDNSServiceRuleRequest self = new CreateDNSServiceRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDNSServiceRuleRequest setAuthorizationRuleDescription(String authorizationRuleDescription) {
        this.authorizationRuleDescription = authorizationRuleDescription;
        return this;
    }
    public String getAuthorizationRuleDescription() {
        return this.authorizationRuleDescription;
    }

    public CreateDNSServiceRuleRequest setAuthorizationRuleName(String authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public CreateDNSServiceRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDNSServiceRuleRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateDNSServiceRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDNSServiceRuleRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateDNSServiceRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDNSServiceRuleRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateDNSServiceRuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

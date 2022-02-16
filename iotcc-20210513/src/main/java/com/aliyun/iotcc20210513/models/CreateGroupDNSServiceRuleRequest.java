// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupDNSServiceRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DNSServiceRuleDescription")
    public String DNSServiceRuleDescription;

    @NameInMap("DNSServiceRuleName")
    public String DNSServiceRuleName;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Source")
    public String source;

    public static CreateGroupDNSServiceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDNSServiceRuleRequest self = new CreateGroupDNSServiceRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupDNSServiceRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGroupDNSServiceRuleRequest setDNSServiceRuleDescription(String DNSServiceRuleDescription) {
        this.DNSServiceRuleDescription = DNSServiceRuleDescription;
        return this;
    }
    public String getDNSServiceRuleDescription() {
        return this.DNSServiceRuleDescription;
    }

    public CreateGroupDNSServiceRuleRequest setDNSServiceRuleName(String DNSServiceRuleName) {
        this.DNSServiceRuleName = DNSServiceRuleName;
        return this;
    }
    public String getDNSServiceRuleName() {
        return this.DNSServiceRuleName;
    }

    public CreateGroupDNSServiceRuleRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateGroupDNSServiceRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateGroupDNSServiceRuleRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public CreateGroupDNSServiceRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGroupDNSServiceRuleRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateGroupDNSServiceRuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

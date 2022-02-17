// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateDNSServiceRuleAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DNSServiceRuleDescription")
    public String DNSServiceRuleDescription;

    @NameInMap("DNSServiceRuleId")
    public String DNSServiceRuleId;

    @NameInMap("DNSServiceRuleName")
    public String DNSServiceRuleName;

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

    public static UpdateDNSServiceRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSServiceRuleAttributeRequest self = new UpdateDNSServiceRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDNSServiceRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDNSServiceRuleAttributeRequest setDNSServiceRuleDescription(String DNSServiceRuleDescription) {
        this.DNSServiceRuleDescription = DNSServiceRuleDescription;
        return this;
    }
    public String getDNSServiceRuleDescription() {
        return this.DNSServiceRuleDescription;
    }

    public UpdateDNSServiceRuleAttributeRequest setDNSServiceRuleId(String DNSServiceRuleId) {
        this.DNSServiceRuleId = DNSServiceRuleId;
        return this;
    }
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    public UpdateDNSServiceRuleAttributeRequest setDNSServiceRuleName(String DNSServiceRuleName) {
        this.DNSServiceRuleName = DNSServiceRuleName;
        return this;
    }
    public String getDNSServiceRuleName() {
        return this.DNSServiceRuleName;
    }

    public UpdateDNSServiceRuleAttributeRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public UpdateDNSServiceRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateDNSServiceRuleAttributeRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public UpdateDNSServiceRuleAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDNSServiceRuleAttributeRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public UpdateDNSServiceRuleAttributeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

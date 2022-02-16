// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupDNSServiceRuleAttributeRequest extends TeaModel {
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

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Source")
    public String source;

    public static UpdateGroupDNSServiceRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDNSServiceRuleAttributeRequest self = new UpdateGroupDNSServiceRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setDNSServiceRuleDescription(String DNSServiceRuleDescription) {
        this.DNSServiceRuleDescription = DNSServiceRuleDescription;
        return this;
    }
    public String getDNSServiceRuleDescription() {
        return this.DNSServiceRuleDescription;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setDNSServiceRuleId(String DNSServiceRuleId) {
        this.DNSServiceRuleId = DNSServiceRuleId;
        return this;
    }
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setDNSServiceRuleName(String DNSServiceRuleName) {
        this.DNSServiceRuleName = DNSServiceRuleName;
        return this;
    }
    public String getDNSServiceRuleName() {
        return this.DNSServiceRuleName;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public UpdateGroupDNSServiceRuleAttributeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

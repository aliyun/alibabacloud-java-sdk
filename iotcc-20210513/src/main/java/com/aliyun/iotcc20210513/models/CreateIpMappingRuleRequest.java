// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIpMappingRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestinationIp")
    public String destinationIp;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("IpMappingRuleDescription")
    public String ipMappingRuleDescription;

    @NameInMap("IpMappingRuleName")
    public String ipMappingRuleName;

    @NameInMap("MappingIp")
    public String mappingIp;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateIpMappingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpMappingRuleRequest self = new CreateIpMappingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpMappingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpMappingRuleRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public CreateIpMappingRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpMappingRuleRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateIpMappingRuleRequest setIpMappingRuleDescription(String ipMappingRuleDescription) {
        this.ipMappingRuleDescription = ipMappingRuleDescription;
        return this;
    }
    public String getIpMappingRuleDescription() {
        return this.ipMappingRuleDescription;
    }

    public CreateIpMappingRuleRequest setIpMappingRuleName(String ipMappingRuleName) {
        this.ipMappingRuleName = ipMappingRuleName;
        return this;
    }
    public String getIpMappingRuleName() {
        return this.ipMappingRuleName;
    }

    public CreateIpMappingRuleRequest setMappingIp(String mappingIp) {
        this.mappingIp = mappingIp;
        return this;
    }
    public String getMappingIp() {
        return this.mappingIp;
    }

    public CreateIpMappingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

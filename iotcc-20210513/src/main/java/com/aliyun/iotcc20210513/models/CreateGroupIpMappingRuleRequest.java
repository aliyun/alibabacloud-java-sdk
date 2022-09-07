// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupIpMappingRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestinationIp")
    public String destinationIp;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("IpMappingRuleDescription")
    public String ipMappingRuleDescription;

    @NameInMap("IpMappingRuleName")
    public String ipMappingRuleName;

    @NameInMap("MappingIp")
    public String mappingIp;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGroupIpMappingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIpMappingRuleRequest self = new CreateGroupIpMappingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupIpMappingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGroupIpMappingRuleRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public CreateGroupIpMappingRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateGroupIpMappingRuleRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public CreateGroupIpMappingRuleRequest setIpMappingRuleDescription(String ipMappingRuleDescription) {
        this.ipMappingRuleDescription = ipMappingRuleDescription;
        return this;
    }
    public String getIpMappingRuleDescription() {
        return this.ipMappingRuleDescription;
    }

    public CreateGroupIpMappingRuleRequest setIpMappingRuleName(String ipMappingRuleName) {
        this.ipMappingRuleName = ipMappingRuleName;
        return this;
    }
    public String getIpMappingRuleName() {
        return this.ipMappingRuleName;
    }

    public CreateGroupIpMappingRuleRequest setMappingIp(String mappingIp) {
        this.mappingIp = mappingIp;
        return this;
    }
    public String getMappingIp() {
        return this.mappingIp;
    }

    public CreateGroupIpMappingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

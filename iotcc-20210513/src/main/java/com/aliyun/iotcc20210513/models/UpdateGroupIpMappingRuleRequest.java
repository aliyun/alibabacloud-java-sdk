// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupIpMappingRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestinationIp")
    public String destinationIp;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("GroupIpMappingRuleId")
    public String groupIpMappingRuleId;

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

    public static UpdateGroupIpMappingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupIpMappingRuleRequest self = new UpdateGroupIpMappingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupIpMappingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateGroupIpMappingRuleRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public UpdateGroupIpMappingRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateGroupIpMappingRuleRequest setGroupIpMappingRuleId(String groupIpMappingRuleId) {
        this.groupIpMappingRuleId = groupIpMappingRuleId;
        return this;
    }
    public String getGroupIpMappingRuleId() {
        return this.groupIpMappingRuleId;
    }

    public UpdateGroupIpMappingRuleRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public UpdateGroupIpMappingRuleRequest setIpMappingRuleDescription(String ipMappingRuleDescription) {
        this.ipMappingRuleDescription = ipMappingRuleDescription;
        return this;
    }
    public String getIpMappingRuleDescription() {
        return this.ipMappingRuleDescription;
    }

    public UpdateGroupIpMappingRuleRequest setIpMappingRuleName(String ipMappingRuleName) {
        this.ipMappingRuleName = ipMappingRuleName;
        return this;
    }
    public String getIpMappingRuleName() {
        return this.ipMappingRuleName;
    }

    public UpdateGroupIpMappingRuleRequest setMappingIp(String mappingIp) {
        this.mappingIp = mappingIp;
        return this;
    }
    public String getMappingIp() {
        return this.mappingIp;
    }

    public UpdateGroupIpMappingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

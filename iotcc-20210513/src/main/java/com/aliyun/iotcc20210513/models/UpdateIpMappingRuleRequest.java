// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIpMappingRuleRequest extends TeaModel {
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

    @NameInMap("IpMappingRuleId")
    public String ipMappingRuleId;

    @NameInMap("IpMappingRuleName")
    public String ipMappingRuleName;

    @NameInMap("MappingIp")
    public String mappingIp;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIpMappingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpMappingRuleRequest self = new UpdateIpMappingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpMappingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpMappingRuleRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public UpdateIpMappingRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpMappingRuleRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public UpdateIpMappingRuleRequest setIpMappingRuleDescription(String ipMappingRuleDescription) {
        this.ipMappingRuleDescription = ipMappingRuleDescription;
        return this;
    }
    public String getIpMappingRuleDescription() {
        return this.ipMappingRuleDescription;
    }

    public UpdateIpMappingRuleRequest setIpMappingRuleId(String ipMappingRuleId) {
        this.ipMappingRuleId = ipMappingRuleId;
        return this;
    }
    public String getIpMappingRuleId() {
        return this.ipMappingRuleId;
    }

    public UpdateIpMappingRuleRequest setIpMappingRuleName(String ipMappingRuleName) {
        this.ipMappingRuleName = ipMappingRuleName;
        return this;
    }
    public String getIpMappingRuleName() {
        return this.ipMappingRuleName;
    }

    public UpdateIpMappingRuleRequest setMappingIp(String mappingIp) {
        this.mappingIp = mappingIp;
        return this;
    }
    public String getMappingIp() {
        return this.mappingIp;
    }

    public UpdateIpMappingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

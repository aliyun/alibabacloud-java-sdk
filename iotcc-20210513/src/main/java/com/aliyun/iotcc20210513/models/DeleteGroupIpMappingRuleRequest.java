// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteGroupIpMappingRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("GroupIpMappingRuleId")
    public String groupIpMappingRuleId;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGroupIpMappingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupIpMappingRuleRequest self = new DeleteGroupIpMappingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupIpMappingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteGroupIpMappingRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteGroupIpMappingRuleRequest setGroupIpMappingRuleId(String groupIpMappingRuleId) {
        this.groupIpMappingRuleId = groupIpMappingRuleId;
        return this;
    }
    public String getGroupIpMappingRuleId() {
        return this.groupIpMappingRuleId;
    }

    public DeleteGroupIpMappingRuleRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public DeleteGroupIpMappingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

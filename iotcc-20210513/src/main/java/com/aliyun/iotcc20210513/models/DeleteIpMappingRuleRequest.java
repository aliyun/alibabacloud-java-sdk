// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIpMappingRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("IpMappingRuleId")
    public String ipMappingRuleId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteIpMappingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpMappingRuleRequest self = new DeleteIpMappingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpMappingRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIpMappingRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteIpMappingRuleRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public DeleteIpMappingRuleRequest setIpMappingRuleId(String ipMappingRuleId) {
        this.ipMappingRuleId = ipMappingRuleId;
        return this;
    }
    public String getIpMappingRuleId() {
        return this.ipMappingRuleId;
    }

    public DeleteIpMappingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

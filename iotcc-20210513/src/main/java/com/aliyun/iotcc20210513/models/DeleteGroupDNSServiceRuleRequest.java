// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteGroupDNSServiceRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DNSServiceRuleId")
    public String DNSServiceRuleId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGroupDNSServiceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupDNSServiceRuleRequest self = new DeleteGroupDNSServiceRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupDNSServiceRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteGroupDNSServiceRuleRequest setDNSServiceRuleId(String DNSServiceRuleId) {
        this.DNSServiceRuleId = DNSServiceRuleId;
        return this;
    }
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    public DeleteGroupDNSServiceRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteGroupDNSServiceRuleRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public DeleteGroupDNSServiceRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

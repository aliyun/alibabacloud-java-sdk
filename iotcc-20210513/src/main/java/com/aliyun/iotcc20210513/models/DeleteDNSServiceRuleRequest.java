// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteDNSServiceRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DNSServiceRuleId")
    public String DNSServiceRuleId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDNSServiceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNSServiceRuleRequest self = new DeleteDNSServiceRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDNSServiceRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteDNSServiceRuleRequest setDNSServiceRuleId(String DNSServiceRuleId) {
        this.DNSServiceRuleId = DNSServiceRuleId;
        return this;
    }
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    public DeleteDNSServiceRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteDNSServiceRuleRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public DeleteDNSServiceRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

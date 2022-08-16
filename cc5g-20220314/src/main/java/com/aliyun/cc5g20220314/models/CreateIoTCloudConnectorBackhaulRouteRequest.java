// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorBackhaulRouteRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NetLinkId")
    public String netLinkId;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static CreateIoTCloudConnectorBackhaulRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorBackhaulRouteRequest self = new CreateIoTCloudConnectorBackhaulRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setNetLinkId(String netLinkId) {
        this.netLinkId = netLinkId;
        return this;
    }
    public String getNetLinkId() {
        return this.netLinkId;
    }

    public CreateIoTCloudConnectorBackhaulRouteRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}

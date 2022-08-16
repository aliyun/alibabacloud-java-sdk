// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SwitchWirelessCloudConnectorToBusinessRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static SwitchWirelessCloudConnectorToBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchWirelessCloudConnectorToBusinessRequest self = new SwitchWirelessCloudConnectorToBusinessRequest();
        return TeaModel.build(map, self);
    }

    public SwitchWirelessCloudConnectorToBusinessRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SwitchWirelessCloudConnectorToBusinessRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public SwitchWirelessCloudConnectorToBusinessRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SwitchWirelessCloudConnectorToBusinessRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TF-******-1633255280-43c94bf7-2dd3-4c14-8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
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

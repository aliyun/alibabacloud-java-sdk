// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RevokeNetLinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8278082c-0b8c-412c-b0ad-876a3cf0d0f8</p>
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
     * <p>iotcc-ua6xy4vpmi24y114ws</p>
     */
    @NameInMap("NetLinkId")
    public String netLinkId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static RevokeNetLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeNetLinkRequest self = new RevokeNetLinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeNetLinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RevokeNetLinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RevokeNetLinkRequest setNetLinkId(String netLinkId) {
        this.netLinkId = netLinkId;
        return this;
    }
    public String getNetLinkId() {
        return this.netLinkId;
    }

    public RevokeNetLinkRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GrantNetLinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0ba469f-de7f-4dde-8390-0966a1a0ef9a</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111111</p>
     */
    @NameInMap("GrantAliUid")
    public Long grantAliUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cciot-xxxx</p>
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

    public static GrantNetLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantNetLinkRequest self = new GrantNetLinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantNetLinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GrantNetLinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GrantNetLinkRequest setGrantAliUid(Long grantAliUid) {
        this.grantAliUid = grantAliUid;
        return this;
    }
    public Long getGrantAliUid() {
        return this.grantAliUid;
    }

    public GrantNetLinkRequest setNetLinkId(String netLinkId) {
        this.netLinkId = netLinkId;
        return this;
    }
    public String getNetLinkId() {
        return this.netLinkId;
    }

    public GrantNetLinkRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}

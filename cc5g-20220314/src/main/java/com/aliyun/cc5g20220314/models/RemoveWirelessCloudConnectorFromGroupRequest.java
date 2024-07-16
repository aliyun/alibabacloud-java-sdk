// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RemoveWirelessCloudConnectorFromGroupRequest extends TeaModel {
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
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5gg-****</p>
     */
    @NameInMap("WirelessCloudConnectorGroupId")
    public String wirelessCloudConnectorGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WirelessCloudConnectorIds")
    public java.util.List<String> wirelessCloudConnectorIds;

    public static RemoveWirelessCloudConnectorFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWirelessCloudConnectorFromGroupRequest self = new RemoveWirelessCloudConnectorFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWirelessCloudConnectorFromGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveWirelessCloudConnectorFromGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveWirelessCloudConnectorFromGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveWirelessCloudConnectorFromGroupRequest setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
        this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
        return this;
    }
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

    public RemoveWirelessCloudConnectorFromGroupRequest setWirelessCloudConnectorIds(java.util.List<String> wirelessCloudConnectorIds) {
        this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

}

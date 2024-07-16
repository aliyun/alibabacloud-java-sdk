// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorBackhaulRouteRequest extends TeaModel {
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
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static ListIoTCloudConnectorBackhaulRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorBackhaulRouteRequest self = new ListIoTCloudConnectorBackhaulRouteRequest();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorBackhaulRouteRequest setNetLinkId(String netLinkId) {
        this.netLinkId = netLinkId;
        return this;
    }
    public String getNetLinkId() {
        return this.netLinkId;
    }

    public ListIoTCloudConnectorBackhaulRouteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIoTCloudConnectorBackhaulRouteRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}

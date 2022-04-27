// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetWirelessCloudConnectorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static GetWirelessCloudConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWirelessCloudConnectorRequest self = new GetWirelessCloudConnectorRequest();
        return TeaModel.build(map, self);
    }

    public GetWirelessCloudConnectorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetWirelessCloudConnectorRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}

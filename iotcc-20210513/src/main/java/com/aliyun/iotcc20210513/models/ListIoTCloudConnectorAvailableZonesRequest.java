// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorAvailableZonesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    public static ListIoTCloudConnectorAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorAvailableZonesRequest self = new ListIoTCloudConnectorAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorAvailableZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIoTCloudConnectorAvailableZonesRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

}

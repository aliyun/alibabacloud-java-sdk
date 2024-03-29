// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorAvailableZonesResponseBody extends TeaModel {
    @NameInMap("AvailableZoneList")
    public java.util.List<String> availableZoneList;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RequestId")
    public String requestId;

    public static ListIoTCloudConnectorAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorAvailableZonesResponseBody self = new ListIoTCloudConnectorAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorAvailableZonesResponseBody setAvailableZoneList(java.util.List<String> availableZoneList) {
        this.availableZoneList = availableZoneList;
        return this;
    }
    public java.util.List<String> getAvailableZoneList() {
        return this.availableZoneList;
    }

    public ListIoTCloudConnectorAvailableZonesResponseBody setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListIoTCloudConnectorAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

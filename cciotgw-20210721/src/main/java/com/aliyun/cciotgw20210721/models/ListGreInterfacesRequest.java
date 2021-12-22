// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListGreInterfacesRequest extends TeaModel {
    @NameInMap("GreInterfaceId")
    public String greInterfaceId;

    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListGreInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGreInterfacesRequest self = new ListGreInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public ListGreInterfacesRequest setGreInterfaceId(String greInterfaceId) {
        this.greInterfaceId = greInterfaceId;
        return this;
    }
    public String getGreInterfaceId() {
        return this.greInterfaceId;
    }

    public ListGreInterfacesRequest setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public ListGreInterfacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

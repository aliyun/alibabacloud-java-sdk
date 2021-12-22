// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIoTCloudConnectorGatewayRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetIoTCloudConnectorGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIoTCloudConnectorGatewayRequest self = new GetIoTCloudConnectorGatewayRequest();
        return TeaModel.build(map, self);
    }

    public GetIoTCloudConnectorGatewayRequest setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public GetIoTCloudConnectorGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

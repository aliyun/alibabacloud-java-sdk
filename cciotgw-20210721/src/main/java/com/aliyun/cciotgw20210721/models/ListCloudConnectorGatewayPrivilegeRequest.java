// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListCloudConnectorGatewayPrivilegeRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static ListCloudConnectorGatewayPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudConnectorGatewayPrivilegeRequest self = new ListCloudConnectorGatewayPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudConnectorGatewayPrivilegeRequest setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public ListCloudConnectorGatewayPrivilegeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCloudConnectorGatewayPrivilegeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

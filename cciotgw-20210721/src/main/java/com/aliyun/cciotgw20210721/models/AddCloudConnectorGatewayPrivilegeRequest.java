// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AddCloudConnectorGatewayPrivilegeRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserAliUid")
    public String userAliUid;

    public static AddCloudConnectorGatewayPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCloudConnectorGatewayPrivilegeRequest self = new AddCloudConnectorGatewayPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public AddCloudConnectorGatewayPrivilegeRequest setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public AddCloudConnectorGatewayPrivilegeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCloudConnectorGatewayPrivilegeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddCloudConnectorGatewayPrivilegeRequest setUserAliUid(String userAliUid) {
        this.userAliUid = userAliUid;
        return this;
    }
    public String getUserAliUid() {
        return this.userAliUid;
    }

}

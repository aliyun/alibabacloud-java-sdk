// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class DeleteCloudConnectorGatewayPrivilegeRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserAliUid")
    public String userAliUid;

    public static DeleteCloudConnectorGatewayPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudConnectorGatewayPrivilegeRequest self = new DeleteCloudConnectorGatewayPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudConnectorGatewayPrivilegeRequest setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public DeleteCloudConnectorGatewayPrivilegeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteCloudConnectorGatewayPrivilegeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteCloudConnectorGatewayPrivilegeRequest setUserAliUid(String userAliUid) {
        this.userAliUid = userAliUid;
        return this;
    }
    public String getUserAliUid() {
        return this.userAliUid;
    }

}

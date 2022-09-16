// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RevokeCoordinatePrivilegeRequest extends TeaModel {
    @NameInMap("CoId")
    public String coId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("Uuid")
    public String uuid;

    public static RevokeCoordinatePrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeCoordinatePrivilegeRequest self = new RevokeCoordinatePrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public RevokeCoordinatePrivilegeRequest setCoId(String coId) {
        this.coId = coId;
        return this;
    }
    public String getCoId() {
        return this.coId;
    }

    public RevokeCoordinatePrivilegeRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public RevokeCoordinatePrivilegeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeCoordinatePrivilegeRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public RevokeCoordinatePrivilegeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinatePrivilegeRequest extends TeaModel {
    /**
     * <p>The ID of the application for the coordinate permissions.</p>
     */
    @NameInMap("CoId")
    public String coId;

    /**
     * <p>The ID of the end user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of user who requires the coordinate permissions.</p>
     * <br>
     * <p>Valid value: TENANT_ADMIN.</p>
     */
    @NameInMap("UserType")
    public String userType;

    /**
     * <p>The unique identifier of the client. If you use an Alibaba Cloud Workspace client, click **About** on the client logon page to view the identifier of the client.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ApplyCoordinatePrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinatePrivilegeRequest self = new ApplyCoordinatePrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinatePrivilegeRequest setCoId(String coId) {
        this.coId = coId;
        return this;
    }
    public String getCoId() {
        return this.coId;
    }

    public ApplyCoordinatePrivilegeRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ApplyCoordinatePrivilegeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyCoordinatePrivilegeRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ApplyCoordinatePrivilegeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

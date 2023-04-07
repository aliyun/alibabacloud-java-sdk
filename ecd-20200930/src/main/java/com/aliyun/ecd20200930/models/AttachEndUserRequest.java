// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachEndUserRequest extends TeaModel {
    /**
     * <p>The address of the Active Directory (AD) workspace.</p>
     */
    @NameInMap("AdDomain")
    public String adDomain;

    /**
     * <p>The type of the Alibaba Cloud Workspace client that runs on the device.</p>
     * <br>
     * <p>*   1: the hardware client</p>
     * <p>*   2: the software client</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The ID of the device.</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The account type of the user.</p>
     * <br>
     * <p>*   SIMPLE: the convenience user</p>
     * <p>*   AD: the AD user</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static AttachEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEndUserRequest self = new AttachEndUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachEndUserRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public AttachEndUserRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public AttachEndUserRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AttachEndUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public AttachEndUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public AttachEndUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachEndUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveUsersRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The IDs of the end users.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The maximum storage space of an end user. Unit: bytes.</p>
     */
    @NameInMap("UserMaxSize")
    public Long userMaxSize;

    public static CreateCloudDriveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveUsersRequest self = new CreateCloudDriveUsersRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveUsersRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCloudDriveUsersRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public CreateCloudDriveUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCloudDriveUsersRequest setUserMaxSize(Long userMaxSize) {
        this.userMaxSize = userMaxSize;
        return this;
    }
    public Long getUserMaxSize() {
        return this.userMaxSize;
    }

}

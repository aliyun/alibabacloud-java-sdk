// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveUsersRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserMaxSize")
    public Long userMaxSize;

    public static ModifyCloudDriveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveUsersRequest self = new ModifyCloudDriveUsersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveUsersRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ModifyCloudDriveUsersRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public ModifyCloudDriveUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudDriveUsersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyCloudDriveUsersRequest setUserMaxSize(Long userMaxSize) {
        this.userMaxSize = userMaxSize;
        return this;
    }
    public Long getUserMaxSize() {
        return this.userMaxSize;
    }

}

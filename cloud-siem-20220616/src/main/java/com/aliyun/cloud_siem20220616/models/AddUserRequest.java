// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     */
    @NameInMap("AddedUserId")
    public Long addedUserId;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserRequest self = new AddUserRequest();
        return TeaModel.build(map, self);
    }

    public AddUserRequest setAddedUserId(Long addedUserId) {
        this.addedUserId = addedUserId;
        return this;
    }
    public Long getAddedUserId() {
        return this.addedUserId;
    }

    public AddUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserRequest extends TeaModel {
    @NameInMap("AddedUserId")
    public Long addedUserId;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    @NameInMap("AddedUserId")
    public Long addedUserId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRequest self = new DeleteUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRequest setAddedUserId(Long addedUserId) {
        this.addedUserId = addedUserId;
        return this;
    }
    public Long getAddedUserId() {
        return this.addedUserId;
    }

    public DeleteUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

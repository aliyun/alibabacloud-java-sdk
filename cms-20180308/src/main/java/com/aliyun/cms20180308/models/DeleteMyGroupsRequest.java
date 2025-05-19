// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteMyGroupsRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMyGroupsRequest self = new DeleteMyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMyGroupsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteMyGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

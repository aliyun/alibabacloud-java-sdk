// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetContactsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static GetContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContactsRequest self = new GetContactsRequest();
        return TeaModel.build(map, self);
    }

    public GetContactsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetContactsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

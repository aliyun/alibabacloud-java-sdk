// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListRdUsersRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListRdUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRdUsersRequest self = new ListRdUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListRdUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

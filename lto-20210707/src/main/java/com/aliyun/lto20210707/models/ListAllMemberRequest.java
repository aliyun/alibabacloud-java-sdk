// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllMemberRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAllMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllMemberRequest self = new ListAllMemberRequest();
        return TeaModel.build(map, self);
    }

    public ListAllMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

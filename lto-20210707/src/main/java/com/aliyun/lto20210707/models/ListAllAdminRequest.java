// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllAdminRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAllAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllAdminRequest self = new ListAllAdminRequest();
        return TeaModel.build(map, self);
    }

    public ListAllAdminRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

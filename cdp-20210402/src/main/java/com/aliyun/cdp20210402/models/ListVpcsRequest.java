// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListVpcsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListVpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcsRequest self = new ListVpcsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

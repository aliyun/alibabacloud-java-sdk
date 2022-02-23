// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListOssinfosRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListOssinfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOssinfosRequest self = new ListOssinfosRequest();
        return TeaModel.build(map, self);
    }

    public ListOssinfosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

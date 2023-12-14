// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeProdCountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeProdCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProdCountRequest self = new DescribeProdCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProdCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

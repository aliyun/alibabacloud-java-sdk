// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableAccessForCloudSiemRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static EnableAccessForCloudSiemRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAccessForCloudSiemRequest self = new EnableAccessForCloudSiemRequest();
        return TeaModel.build(map, self);
    }

    public EnableAccessForCloudSiemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

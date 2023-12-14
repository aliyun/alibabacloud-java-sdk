// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableServiceForCloudSiemRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static EnableServiceForCloudSiemRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceForCloudSiemRequest self = new EnableServiceForCloudSiemRequest();
        return TeaModel.build(map, self);
    }

    public EnableServiceForCloudSiemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

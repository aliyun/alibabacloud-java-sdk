// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceVersionRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X 1.0 instance whose version you want to query.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDrdsInstanceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceVersionRequest self = new DescribeDrdsInstanceVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceVersionRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsInstanceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

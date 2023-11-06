// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to query.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region in which the instance is created.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDrdsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceRequest self = new DescribeDrdsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

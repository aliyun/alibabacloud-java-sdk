// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ReleaseHiStoreInstanceRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("HistoreInstanceId")
    @Validation(required = true)
    public String historeInstanceId;

    public static ReleaseHiStoreInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseHiStoreInstanceRequest self = new ReleaseHiStoreInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseHiStoreInstanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ReleaseHiStoreInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseHiStoreInstanceRequest setHistoreInstanceId(String historeInstanceId) {
        this.historeInstanceId = historeInstanceId;
        return this;
    }
    public String getHistoreInstanceId() {
        return this.historeInstanceId;
    }

}

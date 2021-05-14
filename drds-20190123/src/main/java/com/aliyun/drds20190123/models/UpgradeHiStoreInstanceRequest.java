// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeHiStoreInstanceRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("HistoreInstanceId")
    public String historeInstanceId;

    public static UpgradeHiStoreInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeHiStoreInstanceRequest self = new UpgradeHiStoreInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeHiStoreInstanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public UpgradeHiStoreInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeHiStoreInstanceRequest setHistoreInstanceId(String historeInstanceId) {
        this.historeInstanceId = historeInstanceId;
        return this;
    }
    public String getHistoreInstanceId() {
        return this.historeInstanceId;
    }

}

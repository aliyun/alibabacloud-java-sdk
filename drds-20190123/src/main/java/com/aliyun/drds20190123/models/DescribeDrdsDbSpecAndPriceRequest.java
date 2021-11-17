// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbSpecAndPriceRequest extends TeaModel {
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDrdsDbSpecAndPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbSpecAndPriceRequest self = new DescribeDrdsDbSpecAndPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbSpecAndPriceRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeDrdsDbSpecAndPriceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsDbSpecAndPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

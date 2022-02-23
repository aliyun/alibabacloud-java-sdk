// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckLeftCuRequest extends TeaModel {
    @NameInMap("CuNum")
    public Integer cuNum;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CheckLeftCuRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLeftCuRequest self = new CheckLeftCuRequest();
        return TeaModel.build(map, self);
    }

    public CheckLeftCuRequest setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }
    public Integer getCuNum() {
        return this.cuNum;
    }

    public CheckLeftCuRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckLeftCuRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

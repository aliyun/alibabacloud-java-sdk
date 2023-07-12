// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StopEaisEiRequest extends TeaModel {
    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static StopEaisEiRequest build(java.util.Map<String, ?> map) throws Exception {
        StopEaisEiRequest self = new StopEaisEiRequest();
        return TeaModel.build(map, self);
    }

    public StopEaisEiRequest setEiInstanceId(String eiInstanceId) {
        this.eiInstanceId = eiInstanceId;
        return this;
    }
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    public StopEaisEiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

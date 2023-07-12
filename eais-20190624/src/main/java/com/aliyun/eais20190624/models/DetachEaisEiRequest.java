// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DetachEaisEiRequest extends TeaModel {
    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DetachEaisEiRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachEaisEiRequest self = new DetachEaisEiRequest();
        return TeaModel.build(map, self);
    }

    public DetachEaisEiRequest setEiInstanceId(String eiInstanceId) {
        this.eiInstanceId = eiInstanceId;
        return this;
    }
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    public DetachEaisEiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

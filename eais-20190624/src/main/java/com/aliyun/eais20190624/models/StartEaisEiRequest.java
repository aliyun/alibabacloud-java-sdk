// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StartEaisEiRequest extends TeaModel {
    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static StartEaisEiRequest build(java.util.Map<String, ?> map) throws Exception {
        StartEaisEiRequest self = new StartEaisEiRequest();
        return TeaModel.build(map, self);
    }

    public StartEaisEiRequest setEiInstanceId(String eiInstanceId) {
        this.eiInstanceId = eiInstanceId;
        return this;
    }
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    public StartEaisEiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

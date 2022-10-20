// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DetachEaiRequest extends TeaModel {
    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DetachEaiRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachEaiRequest self = new DetachEaiRequest();
        return TeaModel.build(map, self);
    }

    public DetachEaiRequest setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public DetachEaiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

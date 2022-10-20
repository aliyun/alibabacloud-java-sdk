// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaiRequest extends TeaModel {
    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEaiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaiRequest self = new DeleteEaiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEaiRequest setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public DeleteEaiRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteEaiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

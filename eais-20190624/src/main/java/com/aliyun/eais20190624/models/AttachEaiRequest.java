// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaiRequest extends TeaModel {
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static AttachEaiRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEaiRequest self = new AttachEaiRequest();
        return TeaModel.build(map, self);
    }

    public AttachEaiRequest setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public AttachEaiRequest setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public AttachEaiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

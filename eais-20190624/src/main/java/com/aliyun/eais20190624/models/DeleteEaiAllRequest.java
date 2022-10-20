// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaiAllRequest extends TeaModel {
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    @NameInMap("ElasticAcceleratedInstanceId")
    public String elasticAcceleratedInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEaiAllRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaiAllRequest self = new DeleteEaiAllRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEaiAllRequest setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public DeleteEaiAllRequest setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
        this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
        return this;
    }
    public String getElasticAcceleratedInstanceId() {
        return this.elasticAcceleratedInstanceId;
    }

    public DeleteEaiAllRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

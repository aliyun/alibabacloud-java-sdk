// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ReleasePublicContactPointsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    public static ReleasePublicContactPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicContactPointsRequest self = new ReleasePublicContactPointsRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePublicContactPointsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ReleasePublicContactPointsRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class AllocatePublicContactPointsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocatePublicContactPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicContactPointsRequest self = new AllocatePublicContactPointsRequest();
        return TeaModel.build(map, self);
    }

    public AllocatePublicContactPointsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AllocatePublicContactPointsRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public AllocatePublicContactPointsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

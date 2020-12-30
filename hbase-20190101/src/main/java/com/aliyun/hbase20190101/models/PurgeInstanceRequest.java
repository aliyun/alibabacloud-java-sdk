// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class PurgeInstanceRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static PurgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PurgeInstanceRequest self = new PurgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PurgeInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

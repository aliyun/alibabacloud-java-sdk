// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListEmrHiveDatabasesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListEmrHiveDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEmrHiveDatabasesRequest self = new ListEmrHiveDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListEmrHiveDatabasesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

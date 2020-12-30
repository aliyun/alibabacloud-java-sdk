// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeColdStorageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeColdStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdStorageRequest self = new DescribeColdStorageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeColdStorageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

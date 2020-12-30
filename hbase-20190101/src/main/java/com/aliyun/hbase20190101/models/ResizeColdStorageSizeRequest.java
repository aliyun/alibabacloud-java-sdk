// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeColdStorageSizeRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ColdStorageSize")
    public Integer coldStorageSize;

    public static ResizeColdStorageSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeColdStorageSizeRequest self = new ResizeColdStorageSizeRequest();
        return TeaModel.build(map, self);
    }

    public ResizeColdStorageSizeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeColdStorageSizeRequest setColdStorageSize(Integer coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

}

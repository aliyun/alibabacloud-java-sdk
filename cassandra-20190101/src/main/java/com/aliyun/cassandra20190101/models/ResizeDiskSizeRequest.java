// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ResizeDiskSizeRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("DiskSize")
    public Integer diskSize;

    public static ResizeDiskSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskSizeRequest self = new ResizeDiskSizeRequest();
        return TeaModel.build(map, self);
    }

    public ResizeDiskSizeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeDiskSizeRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public ResizeDiskSizeRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ImportServiceDataShrinkRequest extends TeaModel {
    @NameInMap("Partition")
    public String partitionShrink;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("SubPath")
    public String subPath;

    public static ImportServiceDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportServiceDataShrinkRequest self = new ImportServiceDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportServiceDataShrinkRequest setPartitionShrink(String partitionShrink) {
        this.partitionShrink = partitionShrink;
        return this;
    }
    public String getPartitionShrink() {
        return this.partitionShrink;
    }

    public ImportServiceDataShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ImportServiceDataShrinkRequest setSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }
    public String getSubPath() {
        return this.subPath;
    }

}

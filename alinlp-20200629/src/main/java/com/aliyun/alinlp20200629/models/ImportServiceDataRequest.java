// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ImportServiceDataRequest extends TeaModel {
    @NameInMap("Partition")
    public java.util.List<java.util.Map<String, String>> partition;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("SubPath")
    public String subPath;

    public static ImportServiceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportServiceDataRequest self = new ImportServiceDataRequest();
        return TeaModel.build(map, self);
    }

    public ImportServiceDataRequest setPartition(java.util.List<java.util.Map<String, String>> partition) {
        this.partition = partition;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getPartition() {
        return this.partition;
    }

    public ImportServiceDataRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ImportServiceDataRequest setSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }
    public String getSubPath() {
        return this.subPath;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("InstanceType")
    public String instanceType;

    public static ModifyInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTypeRequest self = new ModifyInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTypeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInstanceTypeRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public ModifyInstanceTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}

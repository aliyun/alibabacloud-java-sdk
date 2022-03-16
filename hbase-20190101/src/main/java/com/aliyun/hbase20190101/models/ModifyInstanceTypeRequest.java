// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

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

    public ModifyInstanceTypeRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public ModifyInstanceTypeRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

}

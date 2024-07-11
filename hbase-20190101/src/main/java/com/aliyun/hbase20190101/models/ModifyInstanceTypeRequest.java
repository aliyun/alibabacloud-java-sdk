// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp1x940uh********</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.8xlarge</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
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

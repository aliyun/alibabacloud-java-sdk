// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyMultiZoneClusterNodeTypeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-dj45g7d6rbrd****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.2xlarge</p>
     */
    @NameInMap("LogInstanceType")
    public String logInstanceType;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.8xlarge</p>
     */
    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    public static ModifyMultiZoneClusterNodeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMultiZoneClusterNodeTypeRequest self = new ModifyMultiZoneClusterNodeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMultiZoneClusterNodeTypeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyMultiZoneClusterNodeTypeRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public ModifyMultiZoneClusterNodeTypeRequest setLogInstanceType(String logInstanceType) {
        this.logInstanceType = logInstanceType;
        return this;
    }
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    public ModifyMultiZoneClusterNodeTypeRequest setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

}

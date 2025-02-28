// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterVpcConnectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InsType")
    public String insType;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    public static AllocateClusterVpcConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterVpcConnectionRequest self = new AllocateClusterVpcConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateClusterVpcConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AllocateClusterVpcConnectionRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public AllocateClusterVpcConnectionRequest setInsType(String insType) {
        this.insType = insType;
        return this;
    }
    public String getInsType() {
        return this.insType;
    }

    public AllocateClusterVpcConnectionRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AllocateClusterVpcConnectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

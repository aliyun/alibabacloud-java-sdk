// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSClusterRequest extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Name")
    public String name;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateGWSClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSClusterRequest self = new CreateGWSClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateGWSClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateGWSClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateGWSClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGWSClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}

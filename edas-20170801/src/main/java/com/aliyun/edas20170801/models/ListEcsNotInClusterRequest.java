// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcsNotInClusterRequest extends TeaModel {
    @NameInMap("NetworkMode")
    public Integer networkMode;

    @NameInMap("VpcId")
    public String vpcId;

    public static ListEcsNotInClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcsNotInClusterRequest self = new ListEcsNotInClusterRequest();
        return TeaModel.build(map, self);
    }

    public ListEcsNotInClusterRequest setNetworkMode(Integer networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public Integer getNetworkMode() {
        return this.networkMode;
    }

    public ListEcsNotInClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

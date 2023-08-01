// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcsNotInClusterRequest extends TeaModel {
    /**
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   1: classic network</p>
     * <p>*   2: virtual private cloud (VPC)</p>
     */
    @NameInMap("NetworkMode")
    public Integer networkMode;

    /**
     * <p>The ID of the VPC. This parameter is required if the NetworkMode parameter is set to 2.</p>
     */
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

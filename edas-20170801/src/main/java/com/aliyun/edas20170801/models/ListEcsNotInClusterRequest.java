// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcsNotInClusterRequest extends TeaModel {
    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li>1: classic network</li>
     * <li>2: virtual private cloud (VPC)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetworkMode")
    public Integer networkMode;

    /**
     * <p>The ID of the VPC. This parameter is required if the NetworkMode parameter is set to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zef6ob8****v8x3q46kp</p>
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

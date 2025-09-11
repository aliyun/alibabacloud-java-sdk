// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class QuickDeployClusterShrinkRequest extends TeaModel {
    @NameInMap("CertManaged")
    public Boolean certManaged;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster_on****</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceList")
    public String instanceListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchIdList")
    public String vSwitchIdListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-7xvkh90cw39p0****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WhiteList")
    public String whiteListShrink;

    public static QuickDeployClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuickDeployClusterShrinkRequest self = new QuickDeployClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuickDeployClusterShrinkRequest setCertManaged(Boolean certManaged) {
        this.certManaged = certManaged;
        return this;
    }
    public Boolean getCertManaged() {
        return this.certManaged;
    }

    public QuickDeployClusterShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public QuickDeployClusterShrinkRequest setInstanceListShrink(String instanceListShrink) {
        this.instanceListShrink = instanceListShrink;
        return this;
    }
    public String getInstanceListShrink() {
        return this.instanceListShrink;
    }

    public QuickDeployClusterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QuickDeployClusterShrinkRequest setVSwitchIdListShrink(String vSwitchIdListShrink) {
        this.vSwitchIdListShrink = vSwitchIdListShrink;
        return this;
    }
    public String getVSwitchIdListShrink() {
        return this.vSwitchIdListShrink;
    }

    public QuickDeployClusterShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public QuickDeployClusterShrinkRequest setWhiteListShrink(String whiteListShrink) {
        this.whiteListShrink = whiteListShrink;
        return this;
    }
    public String getWhiteListShrink() {
        return this.whiteListShrink;
    }

}

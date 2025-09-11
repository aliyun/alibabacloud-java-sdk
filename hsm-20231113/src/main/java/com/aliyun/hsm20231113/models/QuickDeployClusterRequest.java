// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class QuickDeployClusterRequest extends TeaModel {
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
    public java.util.List<String> instanceList;

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
    public java.util.List<String> vSwitchIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-7xvkh90cw39p0****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    public static QuickDeployClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        QuickDeployClusterRequest self = new QuickDeployClusterRequest();
        return TeaModel.build(map, self);
    }

    public QuickDeployClusterRequest setCertManaged(Boolean certManaged) {
        this.certManaged = certManaged;
        return this;
    }
    public Boolean getCertManaged() {
        return this.certManaged;
    }

    public QuickDeployClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public QuickDeployClusterRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public QuickDeployClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QuickDeployClusterRequest setVSwitchIdList(java.util.List<String> vSwitchIdList) {
        this.vSwitchIdList = vSwitchIdList;
        return this;
    }
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    public QuickDeployClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public QuickDeployClusterRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

}

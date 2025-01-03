// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateResourceShrinkRequest extends TeaModel {
    /**
     * <p>Cluster Description</p>
     * 
     * <strong>example:</strong>
     * <p>ppu集群</p>
     */
    @NameInMap("ClusterDesc")
    public String clusterDesc;

    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-sh-fj71c0ycfw</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Cluster Name</p>
     * 
     * <strong>example:</strong>
     * <p>tre-1-ppu</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Cluster Type</p>
     * 
     * <strong>example:</strong>
     * <p>ACK</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Machine Types</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypesShrink;

    /**
     * <p>Resource Type</p>
     * 
     * <strong>example:</strong>
     * <p>ACK</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>User Access Parameters</p>
     */
    @NameInMap("UserAccessParam")
    public String userAccessParamShrink;

    public static CreateResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceShrinkRequest self = new CreateResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceShrinkRequest setClusterDesc(String clusterDesc) {
        this.clusterDesc = clusterDesc;
        return this;
    }
    public String getClusterDesc() {
        return this.clusterDesc;
    }

    public CreateResourceShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateResourceShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateResourceShrinkRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateResourceShrinkRequest setMachineTypesShrink(String machineTypesShrink) {
        this.machineTypesShrink = machineTypesShrink;
        return this;
    }
    public String getMachineTypesShrink() {
        return this.machineTypesShrink;
    }

    public CreateResourceShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateResourceShrinkRequest setUserAccessParamShrink(String userAccessParamShrink) {
        this.userAccessParamShrink = userAccessParamShrink;
        return this;
    }
    public String getUserAccessParamShrink() {
        return this.userAccessParamShrink;
    }

}

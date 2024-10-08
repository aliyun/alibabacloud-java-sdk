// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AddContainerClusterRequest extends TeaModel {
    /**
     * <p>The type of the cluster. Only Container Service for Kubernetes (ACK) clusters are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACK</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>description ack pv backup</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cluster that you want to register.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cca8f35f0e0d84540b49d994511c2c87a</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ack_pv_backup_location</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: the classic network</li>
     * <li><strong>VPC</strong>: a virtual private cloud (VPC)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    public static AddContainerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerClusterRequest self = new AddContainerClusterRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public AddContainerClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddContainerClusterRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public AddContainerClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddContainerClusterRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

}

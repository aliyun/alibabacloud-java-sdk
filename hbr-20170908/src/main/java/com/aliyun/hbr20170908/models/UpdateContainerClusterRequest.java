// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateContainerClusterRequest extends TeaModel {
    /**
     * <p>Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-000**************134</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>description ack pv backup</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>ack_pv_backup_location</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Network type, with possible values including:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: Classic Network.</li>
     * <li><strong>VPC</strong>: Virtual Private Cloud.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>Whether to regenerate the token.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RenewToken")
    public Boolean renewToken;

    public static UpdateContainerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerClusterRequest self = new UpdateContainerClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateContainerClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateContainerClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerClusterRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public UpdateContainerClusterRequest setRenewToken(Boolean renewToken) {
        this.renewToken = renewToken;
        return this;
    }
    public Boolean getRenewToken() {
        return this.renewToken;
    }

}

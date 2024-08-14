// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd90dd24a86fd42f895a1b77df620****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to forcefully delete the master instance in ACK One. Valid values:</p>
     * <ul>
     * <li>true: forcefully deletes the master instance in ACK One.</li>
     * <li>false: does not forcibly delete the master instance in ACK One.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The list of resources to retain.</p>
     */
    @NameInMap("RetainResources")
    public java.util.List<String> retainResources;

    public static DeleteHubClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHubClusterRequest self = new DeleteHubClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHubClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteHubClusterRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteHubClusterRequest setRetainResources(java.util.List<String> retainResources) {
        this.retainResources = retainResources;
        return this;
    }
    public java.util.List<String> getRetainResources() {
        return this.retainResources;
    }

}

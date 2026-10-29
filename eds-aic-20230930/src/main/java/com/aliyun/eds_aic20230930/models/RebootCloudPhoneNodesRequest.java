// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootCloudPhoneNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to force a restart. Valid values:</p>
     * <ul>
     * <li>true: Forces a restart without waiting for the instances to gracefully exit.</li>
     * <li>false: Performs a graceful restart.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The IDs of the cloud phone matrices. Valid values of N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>cpn-05e4d1cec2urdh1j****</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    public static RebootCloudPhoneNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootCloudPhoneNodesRequest self = new RebootCloudPhoneNodesRequest();
        return TeaModel.build(map, self);
    }

    public RebootCloudPhoneNodesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RebootCloudPhoneNodesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

}

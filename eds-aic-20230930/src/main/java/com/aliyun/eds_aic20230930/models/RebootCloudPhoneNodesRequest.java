// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootCloudPhoneNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
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

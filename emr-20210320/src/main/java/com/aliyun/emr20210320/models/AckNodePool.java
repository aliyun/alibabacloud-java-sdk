// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AckNodePool extends TeaModel {
    /**
     * <p>节点池ID。</p>
     * 
     * <strong>example:</strong>
     * <p>npe76629caa1b14a73bf3e47c6d481****</p>
     */
    @NameInMap("NodePoolId")
    public String nodePoolId;

    /**
     * <p>ACK节点选择器。</p>
     */
    @NameInMap("NodeSelector")
    public AckNodeSelector nodeSelector;

    public static AckNodePool build(java.util.Map<String, ?> map) throws Exception {
        AckNodePool self = new AckNodePool();
        return TeaModel.build(map, self);
    }

    public AckNodePool setNodePoolId(String nodePoolId) {
        this.nodePoolId = nodePoolId;
        return this;
    }
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    public AckNodePool setNodeSelector(AckNodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public AckNodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

}

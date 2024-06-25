// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class EdgeClusterAddEdgeMachineRequest extends TeaModel {
    /**
     * <p>The timeout period of sessions. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("expired")
    public Long expired;

    /**
     * <p>The node pool ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c26607f52179f4472a0d9723e7595****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The options that you want to configure.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;enableIptables\&quot;:true,\&quot;quiet\&quot;:true,\&quot;manageRuntime\&quot;:true,\&quot;allowedClusterAddons\&quot;:[\&quot;kube-proxy\&quot;,\&quot;flannel\&quot;,\&quot;coredns\&quot;]}&quot;</p>
     */
    @NameInMap("options")
    public String options;

    public static EdgeClusterAddEdgeMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        EdgeClusterAddEdgeMachineRequest self = new EdgeClusterAddEdgeMachineRequest();
        return TeaModel.build(map, self);
    }

    public EdgeClusterAddEdgeMachineRequest setExpired(Long expired) {
        this.expired = expired;
        return this;
    }
    public Long getExpired() {
        return this.expired;
    }

    public EdgeClusterAddEdgeMachineRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public EdgeClusterAddEdgeMachineRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}

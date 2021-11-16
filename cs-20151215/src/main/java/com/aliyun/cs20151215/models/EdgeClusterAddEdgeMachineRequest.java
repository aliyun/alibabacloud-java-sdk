// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class EdgeClusterAddEdgeMachineRequest extends TeaModel {
    // expired
    @NameInMap("expired")
    public Long expired;

    // nodepool_id
    @NameInMap("nodepool_id")
    public String nodepoolId;

    // options
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

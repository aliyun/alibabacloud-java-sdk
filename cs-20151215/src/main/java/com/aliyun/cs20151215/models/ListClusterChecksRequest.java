// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterChecksRequest extends TeaModel {
    /**
     * <p>The targets to check.</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>The check method.</p>
     * 
     * <strong>example:</strong>
     * <p>ClusterUpgrade</p>
     */
    @NameInMap("type")
    public String type;

    public static ListClusterChecksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterChecksRequest self = new ListClusterChecksRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterChecksRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ListClusterChecksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

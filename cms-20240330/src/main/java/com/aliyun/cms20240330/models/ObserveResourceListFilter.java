// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceListFilter extends TeaModel {
    /**
     * <p>The match condition that requires the observeResourceList of a rule to contain at least one instance ID from the array (OR semantics).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp1a2b3c4d5e6f7g8h9i&quot;]</p>
     */
    @NameInMap("contains")
    public java.util.List<String> contains;

    public static ObserveResourceListFilter build(java.util.Map<String, ?> map) throws Exception {
        ObserveResourceListFilter self = new ObserveResourceListFilter();
        return TeaModel.build(map, self);
    }

    public ObserveResourceListFilter setContains(java.util.List<String> contains) {
        this.contains = contains;
        return this;
    }
    public java.util.List<String> getContains() {
        return this.contains;
    }

}

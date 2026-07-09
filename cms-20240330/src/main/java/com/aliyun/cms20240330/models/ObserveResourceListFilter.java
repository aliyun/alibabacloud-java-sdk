// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceListFilter extends TeaModel {
    /**
     * <p>Returns resources if a specified property contains any string in this array.</p>
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

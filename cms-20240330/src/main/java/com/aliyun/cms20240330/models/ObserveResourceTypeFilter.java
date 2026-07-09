// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceTypeFilter extends TeaModel {
    /**
     * <p>The exact resource type to query. Returns only resources of this type.</p>
     */
    @NameInMap("eq")
    public String eq;

    public static ObserveResourceTypeFilter build(java.util.Map<String, ?> map) throws Exception {
        ObserveResourceTypeFilter self = new ObserveResourceTypeFilter();
        return TeaModel.build(map, self);
    }

    public ObserveResourceTypeFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}

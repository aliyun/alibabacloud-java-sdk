// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DashboardFilter extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("routeName")
    public String routeName;

    public static DashboardFilter build(java.util.Map<String, ?> map) throws Exception {
        DashboardFilter self = new DashboardFilter();
        return TeaModel.build(map, self);
    }

    public DashboardFilter setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

}

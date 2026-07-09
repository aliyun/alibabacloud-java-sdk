// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceGlobalScopeFilter extends TeaModel {
    /**
     * <p>Specifies whether to retrieve only resources that are exclusive to the global scope.</p>
     */
    @NameInMap("eq")
    public Boolean eq;

    public static ObserveResourceGlobalScopeFilter build(java.util.Map<String, ?> map) throws Exception {
        ObserveResourceGlobalScopeFilter self = new ObserveResourceGlobalScopeFilter();
        return TeaModel.build(map, self);
    }

    public ObserveResourceGlobalScopeFilter setEq(Boolean eq) {
        this.eq = eq;
        return this;
    }
    public Boolean getEq() {
        return this.eq;
    }

}

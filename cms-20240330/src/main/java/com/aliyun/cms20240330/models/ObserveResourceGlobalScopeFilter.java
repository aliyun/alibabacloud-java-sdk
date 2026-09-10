// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveResourceGlobalScopeFilter extends TeaModel {
    /**
     * <p>The exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

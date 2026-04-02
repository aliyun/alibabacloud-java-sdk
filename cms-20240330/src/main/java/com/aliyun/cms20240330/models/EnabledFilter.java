// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnabledFilter extends TeaModel {
    /**
     * <p>精确匹配</p>
     */
    @NameInMap("eq")
    public Boolean eq;

    public static EnabledFilter build(java.util.Map<String, ?> map) throws Exception {
        EnabledFilter self = new EnabledFilter();
        return TeaModel.build(map, self);
    }

    public EnabledFilter setEq(Boolean eq) {
        this.eq = eq;
        return this;
    }
    public Boolean getEq() {
        return this.eq;
    }

}

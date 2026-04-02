// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class StatusFilter extends TeaModel {
    @NameInMap("eq")
    public String eq;

    public static StatusFilter build(java.util.Map<String, ?> map) throws Exception {
        StatusFilter self = new StatusFilter();
        return TeaModel.build(map, self);
    }

    public StatusFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}

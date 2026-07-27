// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class BizSourceFilter extends TeaModel {
    @NameInMap("eq")
    public String eq;

    public static BizSourceFilter build(java.util.Map<String, ?> map) throws Exception {
        BizSourceFilter self = new BizSourceFilter();
        return TeaModel.build(map, self);
    }

    public BizSourceFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}

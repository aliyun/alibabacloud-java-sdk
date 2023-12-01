// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FastFailPolicy extends TeaModel {
    @NameInMap("Action")
    public String action;

    public static FastFailPolicy build(java.util.Map<String, ?> map) throws Exception {
        FastFailPolicy self = new FastFailPolicy();
        return TeaModel.build(map, self);
    }

    public FastFailPolicy setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}

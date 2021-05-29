// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210528_154524307.models;

import com.aliyun.tea.*;

public class YxTestAPIRequest extends TeaModel {
    // param0
    @NameInMap("f0")
    public Integer f0;

    // param1
    @NameInMap("f1")
    public Integer f1;

    public static YxTestAPIRequest build(java.util.Map<String, ?> map) throws Exception {
        YxTestAPIRequest self = new YxTestAPIRequest();
        return TeaModel.build(map, self);
    }

    public YxTestAPIRequest setF0(Integer f0) {
        this.f0 = f0;
        return this;
    }
    public Integer getF0() {
        return this.f0;
    }

    public YxTestAPIRequest setF1(Integer f1) {
        this.f1 = f1;
        return this;
    }
    public Integer getF1() {
        return this.f1;
    }

}

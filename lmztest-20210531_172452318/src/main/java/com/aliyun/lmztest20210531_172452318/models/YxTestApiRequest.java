// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210531_172452318.models;

import com.aliyun.tea.*;

public class YxTestApiRequest extends TeaModel {
    // param0
    @NameInMap("f0")
    public Integer f0;

    // param1
    @NameInMap("f1")
    public Integer f1;

    public static YxTestApiRequest build(java.util.Map<String, ?> map) throws Exception {
        YxTestApiRequest self = new YxTestApiRequest();
        return TeaModel.build(map, self);
    }

    public YxTestApiRequest setF0(Integer f0) {
        this.f0 = f0;
        return this;
    }
    public Integer getF0() {
        return this.f0;
    }

    public YxTestApiRequest setF1(Integer f1) {
        this.f1 = f1;
        return this;
    }
    public Integer getF1() {
        return this.f1;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class FinalizeConfig extends TeaModel {
    @NameInMap("steps")
    public java.util.List<?> steps;

    public static FinalizeConfig build(java.util.Map<String, ?> map) throws Exception {
        FinalizeConfig self = new FinalizeConfig();
        return TeaModel.build(map, self);
    }

    public FinalizeConfig setSteps(java.util.List<?> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<?> getSteps() {
        return this.steps;
    }

}

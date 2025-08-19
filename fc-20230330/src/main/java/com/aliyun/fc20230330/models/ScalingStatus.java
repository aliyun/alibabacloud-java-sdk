// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ScalingStatus extends TeaModel {
    @NameInMap("currentError")
    public String currentError;

    @NameInMap("resourceCount")
    public Long resourceCount;

    public static ScalingStatus build(java.util.Map<String, ?> map) throws Exception {
        ScalingStatus self = new ScalingStatus();
        return TeaModel.build(map, self);
    }

    public ScalingStatus setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ScalingStatus setResourceCount(Long resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }
    public Long getResourceCount() {
        return this.resourceCount;
    }

}

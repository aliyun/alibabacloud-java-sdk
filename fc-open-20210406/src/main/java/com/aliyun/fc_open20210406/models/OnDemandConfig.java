// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class OnDemandConfig extends TeaModel {
    // todo
    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    // 函数详情
    @NameInMap("resource")
    public String resource;

    public static OnDemandConfig build(java.util.Map<String, ?> map) throws Exception {
        OnDemandConfig self = new OnDemandConfig();
        return TeaModel.build(map, self);
    }

    public OnDemandConfig setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public OnDemandConfig setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}

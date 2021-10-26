// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionOnDemandConfigResponseBody extends TeaModel {
    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    @NameInMap("resource")
    public String resource;

    public static PutFunctionOnDemandConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionOnDemandConfigResponseBody self = new PutFunctionOnDemandConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PutFunctionOnDemandConfigResponseBody setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public PutFunctionOnDemandConfigResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionOnDemandConfigRequest extends TeaModel {
    /**
     * <p>The maximum number of instances.</p>
     */
    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    /**
     * <p>The trace ID of the request for Function Compute API, which is also the unique ID of the request.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static PutFunctionOnDemandConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionOnDemandConfigRequest self = new PutFunctionOnDemandConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutFunctionOnDemandConfigRequest setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public PutFunctionOnDemandConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

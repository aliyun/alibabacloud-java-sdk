// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionOnDemandConfigRequest extends TeaModel {
    // The maximum number of on-demand instances. For more information, see [Instance scaling limits](~~185038~~).
    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    // The alias of the service or LATEST.
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

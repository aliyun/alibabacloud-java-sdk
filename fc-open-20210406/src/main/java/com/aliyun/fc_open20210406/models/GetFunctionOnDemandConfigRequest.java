// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionOnDemandConfigRequest extends TeaModel {
    /**
     * <p>Service alias or LATEST. Other versions are not supported.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static GetFunctionOnDemandConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionOnDemandConfigRequest self = new GetFunctionOnDemandConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionOnDemandConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

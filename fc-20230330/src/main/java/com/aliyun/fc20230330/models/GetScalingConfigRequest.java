// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetScalingConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static GetScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScalingConfigRequest self = new GetScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetScalingConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

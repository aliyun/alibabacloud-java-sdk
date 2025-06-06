// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionRequest extends TeaModel {
    /**
     * <p>The version or alias of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>demoQualifier</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static GetFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionRequest self = new GetFunctionRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetFunctionRequest extends TeaModel {
    /**
     * <p>2023-03-10T10:10:10Z</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
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

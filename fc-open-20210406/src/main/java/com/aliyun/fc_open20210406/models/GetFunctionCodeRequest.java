// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionCodeRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    public static GetFunctionCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCodeRequest self = new GetFunctionCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionCodeRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

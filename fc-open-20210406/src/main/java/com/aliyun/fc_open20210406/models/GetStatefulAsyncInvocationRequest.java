// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetStatefulAsyncInvocationRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    public static GetStatefulAsyncInvocationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStatefulAsyncInvocationRequest self = new GetStatefulAsyncInvocationRequest();
        return TeaModel.build(map, self);
    }

    public GetStatefulAsyncInvocationRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

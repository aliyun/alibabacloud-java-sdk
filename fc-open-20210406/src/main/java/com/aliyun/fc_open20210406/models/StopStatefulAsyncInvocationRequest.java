// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class StopStatefulAsyncInvocationRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    public static StopStatefulAsyncInvocationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopStatefulAsyncInvocationRequest self = new StopStatefulAsyncInvocationRequest();
        return TeaModel.build(map, self);
    }

    public StopStatefulAsyncInvocationRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

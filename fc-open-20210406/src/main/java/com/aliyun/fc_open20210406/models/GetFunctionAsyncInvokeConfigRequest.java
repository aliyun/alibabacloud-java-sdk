// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionAsyncInvokeConfigRequest extends TeaModel {
    /**
     * <p>The version or alias of the function.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static GetFunctionAsyncInvokeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionAsyncInvokeConfigRequest self = new GetFunctionAsyncInvokeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionAsyncInvokeConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

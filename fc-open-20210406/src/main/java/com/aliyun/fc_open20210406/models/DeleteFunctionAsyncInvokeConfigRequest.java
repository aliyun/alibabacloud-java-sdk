// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteFunctionAsyncInvokeConfigRequest extends TeaModel {
    /**
     * <p>Deletes the asynchronous invocation configurations of a function in a service.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static DeleteFunctionAsyncInvokeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionAsyncInvokeConfigRequest self = new DeleteFunctionAsyncInvokeConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionAsyncInvokeConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

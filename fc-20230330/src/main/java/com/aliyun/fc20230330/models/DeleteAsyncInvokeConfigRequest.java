// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DeleteAsyncInvokeConfigRequest extends TeaModel {
    /**
     * <p>The version or alias of the function.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static DeleteAsyncInvokeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsyncInvokeConfigRequest self = new DeleteAsyncInvokeConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAsyncInvokeConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutAsyncInvokeConfigRequest extends TeaModel {
    /**
     * <p>The configurations of asynchronous function invocation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PutAsyncInvokeConfigInput body;

    /**
     * <p>The version or alias of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static PutAsyncInvokeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAsyncInvokeConfigRequest self = new PutAsyncInvokeConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutAsyncInvokeConfigRequest setBody(PutAsyncInvokeConfigInput body) {
        this.body = body;
        return this;
    }
    public PutAsyncInvokeConfigInput getBody() {
        return this.body;
    }

    public PutAsyncInvokeConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}

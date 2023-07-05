// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutAsyncInvokeConfigRequest extends TeaModel {
    @NameInMap("body")
    public PutAsyncInvokeConfigInput body;

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

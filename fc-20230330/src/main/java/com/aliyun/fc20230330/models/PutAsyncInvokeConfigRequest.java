// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutAsyncInvokeConfigRequest extends TeaModel {
    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("request")
    public PutAsyncInvokeConfigInput request;

    public static PutAsyncInvokeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAsyncInvokeConfigRequest self = new PutAsyncInvokeConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutAsyncInvokeConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public PutAsyncInvokeConfigRequest setRequest(PutAsyncInvokeConfigInput request) {
        this.request = request;
        return this;
    }
    public PutAsyncInvokeConfigInput getRequest() {
        return this.request;
    }

}

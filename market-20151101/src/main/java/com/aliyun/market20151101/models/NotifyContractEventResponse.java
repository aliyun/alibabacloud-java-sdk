// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class NotifyContractEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyContractEventResponseBody body;

    public static NotifyContractEventResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyContractEventResponse self = new NotifyContractEventResponse();
        return TeaModel.build(map, self);
    }

    public NotifyContractEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyContractEventResponse setBody(NotifyContractEventResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyContractEventResponseBody getBody() {
        return this.body;
    }

}

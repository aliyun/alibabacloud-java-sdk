// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvChangeRecordsResponseBody body;

    public static ListEnvChangeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordsResponse self = new ListEnvChangeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvChangeRecordsResponse setBody(ListEnvChangeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvChangeRecordsResponseBody getBody() {
        return this.body;
    }

}

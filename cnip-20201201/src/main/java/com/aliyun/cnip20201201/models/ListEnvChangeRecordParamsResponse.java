// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvChangeRecordParamsResponseBody body;

    public static ListEnvChangeRecordParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordParamsResponse self = new ListEnvChangeRecordParamsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvChangeRecordParamsResponse setBody(ListEnvChangeRecordParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvChangeRecordParamsResponseBody getBody() {
        return this.body;
    }

}

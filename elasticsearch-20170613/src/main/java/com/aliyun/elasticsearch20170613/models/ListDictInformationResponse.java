// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDictInformationResponseBody body;

    public static ListDictInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDictInformationResponse self = new ListDictInformationResponse();
        return TeaModel.build(map, self);
    }

    public ListDictInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDictInformationResponse setBody(ListDictInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDictInformationResponseBody getBody() {
        return this.body;
    }

}

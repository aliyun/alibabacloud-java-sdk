// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataServiceApisResponseBody body;

    public static ListDataServiceApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApisResponse self = new ListDataServiceApisResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceApisResponse setBody(ListDataServiceApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceApisResponseBody getBody() {
        return this.body;
    }

}

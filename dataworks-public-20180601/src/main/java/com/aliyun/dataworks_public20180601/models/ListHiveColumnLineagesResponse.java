// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListHiveColumnLineagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHiveColumnLineagesResponseBody body;

    public static ListHiveColumnLineagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHiveColumnLineagesResponse self = new ListHiveColumnLineagesResponse();
        return TeaModel.build(map, self);
    }

    public ListHiveColumnLineagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHiveColumnLineagesResponse setBody(ListHiveColumnLineagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHiveColumnLineagesResponseBody getBody() {
        return this.body;
    }

}

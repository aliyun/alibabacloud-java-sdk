// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublicDatasetResponseBody body;

    public static ListPublicDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetResponse self = new ListPublicDatasetResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicDatasetResponse setBody(ListPublicDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicDatasetResponseBody getBody() {
        return this.body;
    }

}

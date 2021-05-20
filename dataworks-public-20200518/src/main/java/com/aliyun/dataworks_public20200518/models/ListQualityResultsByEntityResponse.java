// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQualityResultsByEntityResponseBody body;

    public static ListQualityResultsByEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByEntityResponse self = new ListQualityResultsByEntityResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityResultsByEntityResponse setBody(ListQualityResultsByEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityResultsByEntityResponseBody getBody() {
        return this.body;
    }

}

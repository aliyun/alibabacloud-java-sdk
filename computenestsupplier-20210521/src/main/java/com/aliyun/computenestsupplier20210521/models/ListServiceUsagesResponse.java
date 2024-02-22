// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceUsagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceUsagesResponseBody body;

    public static ListServiceUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceUsagesResponse self = new ListServiceUsagesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceUsagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceUsagesResponse setBody(ListServiceUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceUsagesResponseBody getBody() {
        return this.body;
    }

}

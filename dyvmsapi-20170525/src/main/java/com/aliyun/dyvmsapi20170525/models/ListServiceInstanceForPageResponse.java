// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListServiceInstanceForPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceInstanceForPageResponseBody body;

    public static ListServiceInstanceForPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceForPageResponse self = new ListServiceInstanceForPageResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceForPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceForPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstanceForPageResponse setBody(ListServiceInstanceForPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceForPageResponseBody getBody() {
        return this.body;
    }

}

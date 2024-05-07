// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUserBasicInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserBasicInfosResponseBody body;

    public static ListUserBasicInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserBasicInfosResponse self = new ListUserBasicInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListUserBasicInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserBasicInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserBasicInfosResponse setBody(ListUserBasicInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserBasicInfosResponseBody getBody() {
        return this.body;
    }

}

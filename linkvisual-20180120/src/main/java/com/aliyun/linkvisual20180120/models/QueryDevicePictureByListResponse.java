// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureByListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicePictureByListResponseBody body;

    public static QueryDevicePictureByListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureByListResponse self = new QueryDevicePictureByListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureByListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePictureByListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicePictureByListResponse setBody(QueryDevicePictureByListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePictureByListResponseBody getBody() {
        return this.body;
    }

}

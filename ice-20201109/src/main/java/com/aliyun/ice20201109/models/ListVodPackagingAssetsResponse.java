// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListVodPackagingAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodPackagingAssetsResponseBody body;

    public static ListVodPackagingAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodPackagingAssetsResponse self = new ListVodPackagingAssetsResponse();
        return TeaModel.build(map, self);
    }

    public ListVodPackagingAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodPackagingAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodPackagingAssetsResponse setBody(ListVodPackagingAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodPackagingAssetsResponseBody getBody() {
        return this.body;
    }

}

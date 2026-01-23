// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQualityWatchesResponseBody body;

    public static ListQualityWatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityWatchesResponse self = new ListQualityWatchesResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityWatchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityWatchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQualityWatchesResponse setBody(ListQualityWatchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityWatchesResponseBody getBody() {
        return this.body;
    }

}

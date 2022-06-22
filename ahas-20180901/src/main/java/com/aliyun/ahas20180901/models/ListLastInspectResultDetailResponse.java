// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListLastInspectResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLastInspectResultDetailResponseBody body;

    public static ListLastInspectResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLastInspectResultDetailResponse self = new ListLastInspectResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListLastInspectResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLastInspectResultDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLastInspectResultDetailResponse setBody(ListLastInspectResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLastInspectResultDetailResponseBody getBody() {
        return this.body;
    }

}

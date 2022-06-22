// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListLastScheduledInspectResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLastScheduledInspectResultDetailResponseBody body;

    public static ListLastScheduledInspectResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLastScheduledInspectResultDetailResponse self = new ListLastScheduledInspectResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListLastScheduledInspectResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLastScheduledInspectResultDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLastScheduledInspectResultDetailResponse setBody(ListLastScheduledInspectResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLastScheduledInspectResultDetailResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListIvrTrackingDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIvrTrackingDetailResponseBody body;

    public static ListIvrTrackingDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIvrTrackingDetailResponse self = new ListIvrTrackingDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListIvrTrackingDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIvrTrackingDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIvrTrackingDetailResponse setBody(ListIvrTrackingDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIvrTrackingDetailResponseBody getBody() {
        return this.body;
    }

}

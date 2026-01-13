// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListMeteringDailyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMeteringDailyDetailResult body;

    public static ListMeteringDailyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMeteringDailyDetailResponse self = new ListMeteringDailyDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListMeteringDailyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMeteringDailyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMeteringDailyDetailResponse setBody(ListMeteringDailyDetailResult body) {
        this.body = body;
        return this;
    }
    public ListMeteringDailyDetailResult getBody() {
        return this.body;
    }

}

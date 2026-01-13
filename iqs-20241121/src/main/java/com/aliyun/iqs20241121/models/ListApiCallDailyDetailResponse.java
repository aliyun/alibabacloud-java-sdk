// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListApiCallDailyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiCallDailyDetailResult body;

    public static ListApiCallDailyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiCallDailyDetailResponse self = new ListApiCallDailyDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListApiCallDailyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiCallDailyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiCallDailyDetailResponse setBody(ListApiCallDailyDetailResult body) {
        this.body = body;
        return this;
    }
    public ListApiCallDailyDetailResult getBody() {
        return this.body;
    }

}

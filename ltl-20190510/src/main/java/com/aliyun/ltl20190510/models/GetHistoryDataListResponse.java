// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetHistoryDataListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoryDataListResponseBody body;

    public static GetHistoryDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryDataListResponse self = new GetHistoryDataListResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryDataListResponse setBody(GetHistoryDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoryDataListResponseBody getBody() {
        return this.body;
    }

}

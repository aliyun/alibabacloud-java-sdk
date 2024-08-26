// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetHistoryListByBizTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHistoryListByBizTypeResponseBody body;

    public static GetHistoryListByBizTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryListByBizTypeResponse self = new GetHistoryListByBizTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryListByBizTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryListByBizTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryListByBizTypeResponse setBody(GetHistoryListByBizTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoryListByBizTypeResponseBody getBody() {
        return this.body;
    }

}

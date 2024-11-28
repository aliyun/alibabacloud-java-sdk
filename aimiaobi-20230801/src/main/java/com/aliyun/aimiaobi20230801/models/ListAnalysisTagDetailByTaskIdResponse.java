// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAnalysisTagDetailByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnalysisTagDetailByTaskIdResponseBody body;

    public static ListAnalysisTagDetailByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnalysisTagDetailByTaskIdResponse self = new ListAnalysisTagDetailByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public ListAnalysisTagDetailByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnalysisTagDetailByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnalysisTagDetailByTaskIdResponse setBody(ListAnalysisTagDetailByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnalysisTagDetailByTaskIdResponseBody getBody() {
        return this.body;
    }

}

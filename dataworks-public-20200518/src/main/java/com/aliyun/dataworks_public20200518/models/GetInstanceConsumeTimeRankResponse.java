// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceConsumeTimeRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceConsumeTimeRankResponseBody body;

    public static GetInstanceConsumeTimeRankResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsumeTimeRankResponse self = new GetInstanceConsumeTimeRankResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsumeTimeRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceConsumeTimeRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceConsumeTimeRankResponse setBody(GetInstanceConsumeTimeRankResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceConsumeTimeRankResponseBody getBody() {
        return this.body;
    }

}

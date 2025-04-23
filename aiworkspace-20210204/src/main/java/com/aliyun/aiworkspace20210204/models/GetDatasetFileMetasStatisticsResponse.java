// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetasStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetFileMetasStatisticsResponseBody body;

    public static GetDatasetFileMetasStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetFileMetasStatisticsResponse self = new GetDatasetFileMetasStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetFileMetasStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetFileMetasStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetFileMetasStatisticsResponse setBody(GetDatasetFileMetasStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetFileMetasStatisticsResponseBody getBody() {
        return this.body;
    }

}

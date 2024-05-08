// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsRecordsByFeeIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStatisticsRecordsByFeeIdResponseBody body;

    public static GetStatisticsRecordsByFeeIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsRecordsByFeeIdResponse self = new GetStatisticsRecordsByFeeIdResponse();
        return TeaModel.build(map, self);
    }

    public GetStatisticsRecordsByFeeIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStatisticsRecordsByFeeIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStatisticsRecordsByFeeIdResponse setBody(GetStatisticsRecordsByFeeIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStatisticsRecordsByFeeIdResponseBody getBody() {
        return this.body;
    }

}

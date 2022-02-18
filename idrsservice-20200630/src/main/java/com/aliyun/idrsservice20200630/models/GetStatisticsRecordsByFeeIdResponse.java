// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsRecordsByFeeIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetStatisticsRecordsByFeeIdResponse setBody(GetStatisticsRecordsByFeeIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStatisticsRecordsByFeeIdResponseBody getBody() {
        return this.body;
    }

}

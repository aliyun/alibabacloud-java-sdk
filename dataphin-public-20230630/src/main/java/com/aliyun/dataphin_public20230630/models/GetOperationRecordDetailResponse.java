// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationRecordDetailResponseBody body;

    public static GetOperationRecordDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordDetailResponse self = new GetOperationRecordDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationRecordDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationRecordDetailResponse setBody(GetOperationRecordDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationRecordDetailResponseBody getBody() {
        return this.body;
    }

}

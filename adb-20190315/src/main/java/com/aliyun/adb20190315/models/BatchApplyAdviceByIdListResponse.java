// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BatchApplyAdviceByIdListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchApplyAdviceByIdListResponseBody body;

    public static BatchApplyAdviceByIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchApplyAdviceByIdListResponse self = new BatchApplyAdviceByIdListResponse();
        return TeaModel.build(map, self);
    }

    public BatchApplyAdviceByIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchApplyAdviceByIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchApplyAdviceByIdListResponse setBody(BatchApplyAdviceByIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchApplyAdviceByIdListResponseBody getBody() {
        return this.body;
    }

}

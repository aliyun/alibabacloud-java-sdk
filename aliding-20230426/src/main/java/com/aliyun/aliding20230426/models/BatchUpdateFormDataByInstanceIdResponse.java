// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchUpdateFormDataByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateFormDataByInstanceIdResponseBody body;

    public static BatchUpdateFormDataByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFormDataByInstanceIdResponse self = new BatchUpdateFormDataByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFormDataByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateFormDataByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateFormDataByInstanceIdResponse setBody(BatchUpdateFormDataByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateFormDataByInstanceIdResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecursionRecordWeightResponseBody body;

    public static UpdateRecursionRecordWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordWeightResponse self = new UpdateRecursionRecordWeightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecursionRecordWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecursionRecordWeightResponse setBody(UpdateRecursionRecordWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecursionRecordWeightResponseBody getBody() {
        return this.body;
    }

}

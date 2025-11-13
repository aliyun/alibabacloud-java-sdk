// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordWeightEnableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecursionRecordWeightEnableStatusResponseBody body;

    public static UpdateRecursionRecordWeightEnableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordWeightEnableStatusResponse self = new UpdateRecursionRecordWeightEnableStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordWeightEnableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecursionRecordWeightEnableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecursionRecordWeightEnableStatusResponse setBody(UpdateRecursionRecordWeightEnableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecursionRecordWeightEnableStatusResponseBody getBody() {
        return this.body;
    }

}

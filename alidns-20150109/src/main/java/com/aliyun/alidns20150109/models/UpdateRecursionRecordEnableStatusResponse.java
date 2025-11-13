// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordEnableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecursionRecordEnableStatusResponseBody body;

    public static UpdateRecursionRecordEnableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordEnableStatusResponse self = new UpdateRecursionRecordEnableStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordEnableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecursionRecordEnableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecursionRecordEnableStatusResponse setBody(UpdateRecursionRecordEnableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecursionRecordEnableStatusResponseBody getBody() {
        return this.body;
    }

}

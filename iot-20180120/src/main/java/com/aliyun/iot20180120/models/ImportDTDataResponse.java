// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportDTDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDTDataResponseBody body;

    public static ImportDTDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDTDataResponse self = new ImportDTDataResponse();
        return TeaModel.build(map, self);
    }

    public ImportDTDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDTDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDTDataResponse setBody(ImportDTDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDTDataResponseBody getBody() {
        return this.body;
    }

}

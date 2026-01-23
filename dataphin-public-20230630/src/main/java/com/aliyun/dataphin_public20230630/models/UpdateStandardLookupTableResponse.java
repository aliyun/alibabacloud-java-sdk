// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardLookupTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStandardLookupTableResponseBody body;

    public static UpdateStandardLookupTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardLookupTableResponse self = new UpdateStandardLookupTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStandardLookupTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStandardLookupTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStandardLookupTableResponse setBody(UpdateStandardLookupTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStandardLookupTableResponseBody getBody() {
        return this.body;
    }

}

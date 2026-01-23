// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStandardSetResponseBody body;

    public static UpdateStandardSetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardSetResponse self = new UpdateStandardSetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStandardSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStandardSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStandardSetResponse setBody(UpdateStandardSetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStandardSetResponseBody getBody() {
        return this.body;
    }

}

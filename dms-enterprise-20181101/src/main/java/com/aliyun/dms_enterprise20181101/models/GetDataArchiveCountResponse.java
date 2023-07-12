// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataArchiveCountResponseBody body;

    public static GetDataArchiveCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataArchiveCountResponse self = new GetDataArchiveCountResponse();
        return TeaModel.build(map, self);
    }

    public GetDataArchiveCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataArchiveCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataArchiveCountResponse setBody(GetDataArchiveCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataArchiveCountResponseBody getBody() {
        return this.body;
    }

}

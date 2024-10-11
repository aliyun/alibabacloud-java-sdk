// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateAdHocFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAdHocFileResponseBody body;

    public static UpdateAdHocFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdHocFileResponse self = new UpdateAdHocFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAdHocFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAdHocFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAdHocFileResponse setBody(UpdateAdHocFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdHocFileResponseBody getBody() {
        return this.body;
    }

}

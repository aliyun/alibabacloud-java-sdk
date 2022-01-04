// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLatestDateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static GetLatestDateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestDateResponse self = new GetLatestDateResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestDateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}

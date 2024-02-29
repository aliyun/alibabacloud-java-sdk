// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceStatusStatisticResponseBody body;

    public static GetInstanceStatusStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusStatisticResponse self = new GetInstanceStatusStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceStatusStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceStatusStatisticResponse setBody(GetInstanceStatusStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceStatusStatisticResponseBody getBody() {
        return this.body;
    }

}

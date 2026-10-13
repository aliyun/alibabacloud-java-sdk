// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaProfilingResultDbOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaProfilingResultDbOverviewResponseBody body;

    public static GetMetaProfilingResultDbOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaProfilingResultDbOverviewResponse self = new GetMetaProfilingResultDbOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaProfilingResultDbOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaProfilingResultDbOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaProfilingResultDbOverviewResponse setBody(GetMetaProfilingResultDbOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaProfilingResultDbOverviewResponseBody getBody() {
        return this.body;
    }

}

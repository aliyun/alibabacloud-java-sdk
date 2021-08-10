// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentStatisticsDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPatentStatisticsDetailListResponseBody body;

    public static GetPatentStatisticsDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatentStatisticsDetailListResponse self = new GetPatentStatisticsDetailListResponse();
        return TeaModel.build(map, self);
    }

    public GetPatentStatisticsDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatentStatisticsDetailListResponse setBody(GetPatentStatisticsDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatentStatisticsDetailListResponseBody getBody() {
        return this.body;
    }

}

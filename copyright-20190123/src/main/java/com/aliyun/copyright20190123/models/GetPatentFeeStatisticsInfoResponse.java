// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentFeeStatisticsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPatentFeeStatisticsInfoResponseBody body;

    public static GetPatentFeeStatisticsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatentFeeStatisticsInfoResponse self = new GetPatentFeeStatisticsInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPatentFeeStatisticsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatentFeeStatisticsInfoResponse setBody(GetPatentFeeStatisticsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatentFeeStatisticsInfoResponseBody getBody() {
        return this.body;
    }

}

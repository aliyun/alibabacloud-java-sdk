// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetHdfsCapacityStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHdfsCapacityStatisticInfoResponseBody body;

    public static GetHdfsCapacityStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHdfsCapacityStatisticInfoResponse self = new GetHdfsCapacityStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetHdfsCapacityStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHdfsCapacityStatisticInfoResponse setBody(GetHdfsCapacityStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHdfsCapacityStatisticInfoResponseBody getBody() {
        return this.body;
    }

}

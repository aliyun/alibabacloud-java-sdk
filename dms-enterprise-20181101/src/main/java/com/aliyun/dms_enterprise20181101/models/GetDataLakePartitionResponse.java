// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataLakePartitionResponseBody body;

    public static GetDataLakePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakePartitionResponse self = new GetDataLakePartitionResponse();
        return TeaModel.build(map, self);
    }

    public GetDataLakePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataLakePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataLakePartitionResponse setBody(GetDataLakePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataLakePartitionResponseBody getBody() {
        return this.body;
    }

}

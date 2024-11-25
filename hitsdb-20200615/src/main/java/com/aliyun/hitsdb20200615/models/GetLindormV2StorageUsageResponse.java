// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2StorageUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormV2StorageUsageResponseBody body;

    public static GetLindormV2StorageUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2StorageUsageResponse self = new GetLindormV2StorageUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormV2StorageUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormV2StorageUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormV2StorageUsageResponse setBody(GetLindormV2StorageUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormV2StorageUsageResponseBody getBody() {
        return this.body;
    }

}

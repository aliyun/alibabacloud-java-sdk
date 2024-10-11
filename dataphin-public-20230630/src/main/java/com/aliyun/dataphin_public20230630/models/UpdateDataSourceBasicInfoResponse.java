// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataSourceBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataSourceBasicInfoResponseBody body;

    public static UpdateDataSourceBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceBasicInfoResponse self = new UpdateDataSourceBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSourceBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataSourceBasicInfoResponse setBody(UpdateDataSourceBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSourceBasicInfoResponseBody getBody() {
        return this.body;
    }

}

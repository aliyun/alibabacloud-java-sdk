// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCronClearConfigResponseBody body;

    public static GetDataCronClearConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCronClearConfigResponse self = new GetDataCronClearConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCronClearConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCronClearConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCronClearConfigResponse setBody(GetDataCronClearConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCronClearConfigResponseBody getBody() {
        return this.body;
    }

}

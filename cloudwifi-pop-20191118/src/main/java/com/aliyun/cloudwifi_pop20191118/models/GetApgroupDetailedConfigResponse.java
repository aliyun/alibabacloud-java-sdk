// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupDetailedConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApgroupDetailedConfigResponseBody body;

    public static GetApgroupDetailedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupDetailedConfigResponse self = new GetApgroupDetailedConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApgroupDetailedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApgroupDetailedConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApgroupDetailedConfigResponse setBody(GetApgroupDetailedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApgroupDetailedConfigResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCheckTemplateListResponseBody body;

    public static GetDataCheckTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTemplateListResponse self = new GetDataCheckTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCheckTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCheckTemplateListResponse setBody(GetDataCheckTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCheckTemplateListResponseBody getBody() {
        return this.body;
    }

}

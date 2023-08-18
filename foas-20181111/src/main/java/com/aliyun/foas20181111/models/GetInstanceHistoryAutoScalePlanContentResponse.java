// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceHistoryAutoScalePlanContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceHistoryAutoScalePlanContentResponseBody body;

    public static GetInstanceHistoryAutoScalePlanContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceHistoryAutoScalePlanContentResponse self = new GetInstanceHistoryAutoScalePlanContentResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceHistoryAutoScalePlanContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceHistoryAutoScalePlanContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceHistoryAutoScalePlanContentResponse setBody(GetInstanceHistoryAutoScalePlanContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceHistoryAutoScalePlanContentResponseBody getBody() {
        return this.body;
    }

}

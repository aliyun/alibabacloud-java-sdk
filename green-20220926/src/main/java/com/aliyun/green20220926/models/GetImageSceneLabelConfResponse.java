// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetImageSceneLabelConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageSceneLabelConfResponseBody body;

    public static GetImageSceneLabelConfResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageSceneLabelConfResponse self = new GetImageSceneLabelConfResponse();
        return TeaModel.build(map, self);
    }

    public GetImageSceneLabelConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageSceneLabelConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageSceneLabelConfResponse setBody(GetImageSceneLabelConfResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageSceneLabelConfResponseBody getBody() {
        return this.body;
    }

}

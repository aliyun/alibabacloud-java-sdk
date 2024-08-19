// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetImageSceneLabelListConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageSceneLabelListConfResponseBody body;

    public static GetImageSceneLabelListConfResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageSceneLabelListConfResponse self = new GetImageSceneLabelListConfResponse();
        return TeaModel.build(map, self);
    }

    public GetImageSceneLabelListConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageSceneLabelListConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageSceneLabelListConfResponse setBody(GetImageSceneLabelListConfResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageSceneLabelListConfResponseBody getBody() {
        return this.body;
    }

}

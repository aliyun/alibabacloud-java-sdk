// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetTextTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextTaskResult body;

    public static GetTextTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextTaskResponse self = new GetTextTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTextTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTextTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTextTaskResponse setBody(TextTaskResult body) {
        this.body = body;
        return this;
    }
    public TextTaskResult getBody() {
        return this.body;
    }

}

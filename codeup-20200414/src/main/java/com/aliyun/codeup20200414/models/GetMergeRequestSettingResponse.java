// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetMergeRequestSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMergeRequestSettingResponseBody body;

    public static GetMergeRequestSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestSettingResponse self = new GetMergeRequestSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMergeRequestSettingResponse setBody(GetMergeRequestSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMergeRequestSettingResponseBody getBody() {
        return this.body;
    }

}

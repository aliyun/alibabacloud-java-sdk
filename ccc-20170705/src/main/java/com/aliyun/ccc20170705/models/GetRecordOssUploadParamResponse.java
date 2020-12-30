// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRecordOssUploadParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRecordOssUploadParamResponseBody body;

    public static GetRecordOssUploadParamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordOssUploadParamResponse self = new GetRecordOssUploadParamResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordOssUploadParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordOssUploadParamResponse setBody(GetRecordOssUploadParamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordOssUploadParamResponseBody getBody() {
        return this.body;
    }

}

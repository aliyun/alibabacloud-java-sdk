// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureInfoWithVectorIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPictureInfoWithVectorIdsResponseBody body;

    public static GetPictureInfoWithVectorIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPictureInfoWithVectorIdsResponse self = new GetPictureInfoWithVectorIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetPictureInfoWithVectorIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPictureInfoWithVectorIdsResponse setBody(GetPictureInfoWithVectorIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPictureInfoWithVectorIdsResponseBody getBody() {
        return this.body;
    }

}

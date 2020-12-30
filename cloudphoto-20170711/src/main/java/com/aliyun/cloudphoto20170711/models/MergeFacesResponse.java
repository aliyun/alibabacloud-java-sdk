// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MergeFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MergeFacesResponseBody body;

    public static MergeFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeFacesResponse self = new MergeFacesResponse();
        return TeaModel.build(map, self);
    }

    public MergeFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeFacesResponse setBody(MergeFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeFacesResponseBody getBody() {
        return this.body;
    }

}

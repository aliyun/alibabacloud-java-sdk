// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMLastAliyunResourceSyncResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHDMLastAliyunResourceSyncResultResponseBody body;

    public static GetHDMLastAliyunResourceSyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHDMLastAliyunResourceSyncResultResponse self = new GetHDMLastAliyunResourceSyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHDMLastAliyunResourceSyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setBody(GetHDMLastAliyunResourceSyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHDMLastAliyunResourceSyncResultResponseBody getBody() {
        return this.body;
    }

}

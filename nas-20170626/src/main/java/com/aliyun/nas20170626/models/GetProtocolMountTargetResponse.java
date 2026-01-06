// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetProtocolMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProtocolMountTargetResponseBody body;

    public static GetProtocolMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProtocolMountTargetResponse self = new GetProtocolMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public GetProtocolMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProtocolMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProtocolMountTargetResponse setBody(GetProtocolMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProtocolMountTargetResponseBody getBody() {
        return this.body;
    }

}

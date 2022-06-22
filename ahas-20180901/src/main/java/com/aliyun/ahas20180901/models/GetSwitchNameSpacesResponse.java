// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchNameSpacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwitchNameSpacesResponseBody body;

    public static GetSwitchNameSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchNameSpacesResponse self = new GetSwitchNameSpacesResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchNameSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchNameSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwitchNameSpacesResponse setBody(GetSwitchNameSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchNameSpacesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListOAuth2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePlayingListOAuth2ResponseBody body;

    public static CreatePlayingListOAuth2Response build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListOAuth2Response self = new CreatePlayingListOAuth2Response();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListOAuth2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePlayingListOAuth2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePlayingListOAuth2Response setBody(CreatePlayingListOAuth2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePlayingListOAuth2ResponseBody getBody() {
        return this.body;
    }

}

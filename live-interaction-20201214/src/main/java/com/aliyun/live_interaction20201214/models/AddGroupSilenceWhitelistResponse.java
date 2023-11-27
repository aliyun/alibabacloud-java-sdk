// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupSilenceWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddGroupSilenceWhitelistResponseBody body;

    public static AddGroupSilenceWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupSilenceWhitelistResponse self = new AddGroupSilenceWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupSilenceWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupSilenceWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupSilenceWhitelistResponse setBody(AddGroupSilenceWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupSilenceWhitelistResponseBody getBody() {
        return this.body;
    }

}

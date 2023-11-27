// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupSilenceBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddGroupSilenceBlacklistResponseBody body;

    public static AddGroupSilenceBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupSilenceBlacklistResponse self = new AddGroupSilenceBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupSilenceBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupSilenceBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupSilenceBlacklistResponse setBody(AddGroupSilenceBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupSilenceBlacklistResponseBody getBody() {
        return this.body;
    }

}

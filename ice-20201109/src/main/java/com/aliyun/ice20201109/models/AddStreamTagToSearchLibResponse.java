// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddStreamTagToSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddStreamTagToSearchLibResponseBody body;

    public static AddStreamTagToSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStreamTagToSearchLibResponse self = new AddStreamTagToSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public AddStreamTagToSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddStreamTagToSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddStreamTagToSearchLibResponse setBody(AddStreamTagToSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public AddStreamTagToSearchLibResponseBody getBody() {
        return this.body;
    }

}

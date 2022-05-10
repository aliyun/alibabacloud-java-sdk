// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindAllPictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialFindAllPictureResponseBody body;

    public static MaterialFindAllPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindAllPictureResponse self = new MaterialFindAllPictureResponse();
        return TeaModel.build(map, self);
    }

    public MaterialFindAllPictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialFindAllPictureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MaterialFindAllPictureResponse setBody(MaterialFindAllPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialFindAllPictureResponseBody getBody() {
        return this.body;
    }

}

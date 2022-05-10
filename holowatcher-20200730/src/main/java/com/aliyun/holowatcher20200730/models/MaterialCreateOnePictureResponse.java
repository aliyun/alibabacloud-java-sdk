// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialCreateOnePictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialCreateOnePictureResponseBody body;

    public static MaterialCreateOnePictureResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialCreateOnePictureResponse self = new MaterialCreateOnePictureResponse();
        return TeaModel.build(map, self);
    }

    public MaterialCreateOnePictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialCreateOnePictureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MaterialCreateOnePictureResponse setBody(MaterialCreateOnePictureResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialCreateOnePictureResponseBody getBody() {
        return this.body;
    }

}

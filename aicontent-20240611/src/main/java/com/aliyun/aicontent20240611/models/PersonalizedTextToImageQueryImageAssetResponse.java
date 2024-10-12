// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PersonalizedTextToImageQueryImageAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Object body;

    public static PersonalizedTextToImageQueryImageAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        PersonalizedTextToImageQueryImageAssetResponse self = new PersonalizedTextToImageQueryImageAssetResponse();
        return TeaModel.build(map, self);
    }

    public PersonalizedTextToImageQueryImageAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PersonalizedTextToImageQueryImageAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PersonalizedTextToImageQueryImageAssetResponse setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}

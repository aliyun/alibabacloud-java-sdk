// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody body;

    public static PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse self = new PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse();
        return TeaModel.build(map, self);
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse setBody(PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public PersonalizedTextToImageQueryPreModelInferenceJobInfoResponseBody getBody() {
        return this.body;
    }

}

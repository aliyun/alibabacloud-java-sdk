// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListDiagnoseInfoForSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDiagnoseInfoForSingleCardResponseBody body;

    public static ListDiagnoseInfoForSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseInfoForSingleCardResponse self = new ListDiagnoseInfoForSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseInfoForSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnoseInfoForSingleCardResponse setBody(ListDiagnoseInfoForSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnoseInfoForSingleCardResponseBody getBody() {
        return this.body;
    }

}

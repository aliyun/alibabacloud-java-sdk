// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ChangeGradeAliyunInstanceSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeGradeAliyunInstanceSaleResponseBody body;

    public static ChangeGradeAliyunInstanceSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeGradeAliyunInstanceSaleResponse self = new ChangeGradeAliyunInstanceSaleResponse();
        return TeaModel.build(map, self);
    }

    public ChangeGradeAliyunInstanceSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeGradeAliyunInstanceSaleResponse setBody(ChangeGradeAliyunInstanceSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeGradeAliyunInstanceSaleResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetFoodDrugAdministrationThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFoodDrugAdministrationThreeResponseBody body;

    public static GetFoodDrugAdministrationThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFoodDrugAdministrationThreeResponse self = new GetFoodDrugAdministrationThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetFoodDrugAdministrationThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFoodDrugAdministrationThreeResponse setBody(GetFoodDrugAdministrationThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFoodDrugAdministrationThreeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetApiPriceRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static GetApiPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiPriceRequest self = new GetApiPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetApiPriceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class PayOrderCallbackRequest extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static PayOrderCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackRequest self = new PayOrderCallbackRequest();
        return TeaModel.build(map, self);
    }

    public PayOrderCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}

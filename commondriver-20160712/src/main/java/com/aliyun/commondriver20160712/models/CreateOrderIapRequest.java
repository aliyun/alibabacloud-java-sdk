// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class CreateOrderIapRequest extends TeaModel {
    @NameInMap("ParamString")
    public String paramString;

    public static CreateOrderIapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderIapRequest self = new CreateOrderIapRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderIapRequest setParamString(String paramString) {
        this.paramString = paramString;
        return this;
    }
    public String getParamString() {
        return this.paramString;
    }

}

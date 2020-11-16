// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddTrancodeSEIResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddTrancodeSEIResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTrancodeSEIResponse self = new AddTrancodeSEIResponse();
        return TeaModel.build(map, self);
    }

    public AddTrancodeSEIResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

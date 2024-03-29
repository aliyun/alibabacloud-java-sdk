// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CloseOrderResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CloseOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseOrderResponse self = new CloseOrderResponse();
        return TeaModel.build(map, self);
    }

    public CloseOrderResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CloseOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

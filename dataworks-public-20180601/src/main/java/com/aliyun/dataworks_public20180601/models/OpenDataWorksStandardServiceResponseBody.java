// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class OpenDataWorksStandardServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenDataWorksStandardServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDataWorksStandardServiceResponseBody self = new OpenDataWorksStandardServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDataWorksStandardServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenDataWorksStandardServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

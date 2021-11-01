// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ConvertInstanceResponseBody extends TeaModel {
    // 订单id
    @NameInMap("OrderId")
    public Long orderId;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ConvertInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceResponseBody self = new ConvertInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ConvertInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

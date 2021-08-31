// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecResponseBody extends TeaModel {
    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 订单id
    @NameInMap("OrderId")
    public Long orderId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ModifyPrepayInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecResponseBody self = new ModifyPrepayInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPrepayInstanceSpecResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyPrepayInstanceSpecResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

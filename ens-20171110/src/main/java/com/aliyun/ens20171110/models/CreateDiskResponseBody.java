// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskResponseBody extends TeaModel {
    // 实列ID集合
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    // 订单id,多个以逗号分割，可以直接跳转到收银行台 只有预付费返回订单号，后付费不返回
    @NameInMap("OrderId")
    public String orderId;

    // 请求唯一ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskResponseBody self = new CreateDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiskResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateDiskResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

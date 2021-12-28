// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageResponseBody extends TeaModel {
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPackageResponseBody self = new CreateNetworkPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPackageResponseBody setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public CreateNetworkPackageResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateNetworkPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

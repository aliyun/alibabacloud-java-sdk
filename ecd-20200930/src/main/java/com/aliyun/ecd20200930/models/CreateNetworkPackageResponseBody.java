// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the premium bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>np-amtp8e8q1o9e4****</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The ID of the bill.</p>
     * 
     * <strong>example:</strong>
     * <p>234526262716724</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
     */
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

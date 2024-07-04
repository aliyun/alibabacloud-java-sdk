// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskResponseBody extends TeaModel {
    /**
     * <p>The IDs of the instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the order. Multiple IDs are separated by commas (,).</p>
     * <blockquote>
     * <p> This parameter is not returned for the pay-as-you-go billing method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>21127020370****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7030AB96-57CF-1C68-9FEE-D60E547FD79C</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceResponseBody extends TeaModel {
    /**
     * <p>Order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>242461444340562</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of this request, which is a unique identifier generated by Alibaba Cloud for this request and can be used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>0018DF77-7189-5D33-947B-E5B34BFCE07E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceResponseBody self = new ModifyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBandwidthResourcePackagesResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>24251717783****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7B699F-625C-587E-BC5F-1395CA969681</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBandwidthResourcePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthResourcePackagesResponseBody self = new CreateBandwidthResourcePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBandwidthResourcePackagesResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateBandwidthResourcePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

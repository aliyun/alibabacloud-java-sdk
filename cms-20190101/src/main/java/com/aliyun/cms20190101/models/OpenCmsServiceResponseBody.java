// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class OpenCmsServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>211206750270***</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E5A72B5B-4F44-438C-B68A-147FD5DC53A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenCmsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenCmsServiceResponseBody self = new OpenCmsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenCmsServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenCmsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

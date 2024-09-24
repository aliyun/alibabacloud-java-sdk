// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class OpenNASServiceResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20671870151****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>427DB0B3-9436-4A3C-B2BC-B961F95E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenNASServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenNASServiceResponseBody self = new OpenNASServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenNASServiceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public OpenNASServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenNASServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

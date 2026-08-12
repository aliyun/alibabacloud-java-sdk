// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertPrepayInstanceResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2104063546*****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF0426****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the conversion is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConvertPrepayInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertPrepayInstanceResponseBody self = new ConvertPrepayInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertPrepayInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ConvertPrepayInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertPrepayInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

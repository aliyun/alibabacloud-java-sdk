// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDiskEncryptionServiceResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDiskEncryptionServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskEncryptionServiceResponseBody self = new CreateDiskEncryptionServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiskEncryptionServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDiskEncryptionServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDiskEncryptionServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

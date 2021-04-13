// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class DisableProductSpiServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableProductSpiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableProductSpiServiceResponseBody self = new DisableProductSpiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableProductSpiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableProductSpiServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

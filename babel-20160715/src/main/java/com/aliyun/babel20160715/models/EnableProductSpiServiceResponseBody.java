// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class EnableProductSpiServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableProductSpiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableProductSpiServiceResponseBody self = new EnableProductSpiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableProductSpiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableProductSpiServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SwitchProductSpiServiceEnvironmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SwitchProductSpiServiceEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchProductSpiServiceEnvironmentResponseBody self = new SwitchProductSpiServiceEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchProductSpiServiceEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchProductSpiServiceEnvironmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static UpdateInstanceNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNetworkResponse self = new UpdateInstanceNetworkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNetworkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceNetworkResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

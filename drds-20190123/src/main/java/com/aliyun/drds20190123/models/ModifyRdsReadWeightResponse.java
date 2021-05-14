// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyRdsReadWeightResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static ModifyRdsReadWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRdsReadWeightResponse self = new ModifyRdsReadWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRdsReadWeightResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRdsReadWeightResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

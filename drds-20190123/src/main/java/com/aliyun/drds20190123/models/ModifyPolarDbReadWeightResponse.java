// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyPolarDbReadWeightResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static ModifyPolarDbReadWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarDbReadWeightResponse self = new ModifyPolarDbReadWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolarDbReadWeightResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPolarDbReadWeightResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

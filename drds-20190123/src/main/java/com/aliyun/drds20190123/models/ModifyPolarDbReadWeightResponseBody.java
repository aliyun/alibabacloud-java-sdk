// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyPolarDbReadWeightResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyPolarDbReadWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarDbReadWeightResponseBody self = new ModifyPolarDbReadWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolarDbReadWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPolarDbReadWeightResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

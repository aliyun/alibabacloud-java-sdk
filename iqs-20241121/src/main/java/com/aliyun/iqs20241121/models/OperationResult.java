// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class OperationResult extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    public static OperationResult build(java.util.Map<String, ?> map) throws Exception {
        OperationResult self = new OperationResult();
        return TeaModel.build(map, self);
    }

    public OperationResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyRemarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRemarkResponse self = new ModifyRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRemarkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

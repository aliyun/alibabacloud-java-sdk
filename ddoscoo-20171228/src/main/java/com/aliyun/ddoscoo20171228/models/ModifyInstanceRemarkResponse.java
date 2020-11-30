// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRemarkResponse self = new ModifyInstanceRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRemarkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOperateVulResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyOperateVulResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulResponse self = new ModifyOperateVulResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourcePoolSchedulerTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourcePoolSchedulerTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePoolSchedulerTypeResponseBody self = new ModifyResourcePoolSchedulerTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePoolSchedulerTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

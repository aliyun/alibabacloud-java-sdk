// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourcePoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePoolResponseBody self = new ModifyResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPrepayInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecResponseBody self = new ModifyPrepayInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDdosStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDdosStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDdosStatusResponseBody self = new ModifyDdosStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDdosStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlackholeStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBlackholeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlackholeStatusResponseBody self = new ModifyBlackholeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBlackholeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

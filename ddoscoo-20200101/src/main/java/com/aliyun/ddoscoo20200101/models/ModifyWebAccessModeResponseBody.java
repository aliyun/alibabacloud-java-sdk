// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAccessModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebAccessModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAccessModeResponseBody self = new ModifyWebAccessModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebAccessModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

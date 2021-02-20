// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebAreaBlockSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockSwitchResponseBody self = new ModifyWebAreaBlockSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

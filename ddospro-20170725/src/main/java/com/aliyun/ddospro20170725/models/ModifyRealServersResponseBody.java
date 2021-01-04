// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyRealServersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRealServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRealServersResponseBody self = new ModifyRealServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRealServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

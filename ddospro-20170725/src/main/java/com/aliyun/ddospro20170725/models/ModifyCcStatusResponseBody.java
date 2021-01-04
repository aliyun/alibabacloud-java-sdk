// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyCcStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCcStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCcStatusResponseBody self = new ModifyCcStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCcStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

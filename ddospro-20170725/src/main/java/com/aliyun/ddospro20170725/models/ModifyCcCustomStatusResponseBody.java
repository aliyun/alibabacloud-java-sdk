// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyCcCustomStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCcCustomStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCcCustomStatusResponseBody self = new ModifyCcCustomStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCcCustomStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

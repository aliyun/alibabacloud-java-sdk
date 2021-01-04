// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyPersistenceTimeOutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPersistenceTimeOutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPersistenceTimeOutResponseBody self = new ModifyPersistenceTimeOutResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPersistenceTimeOutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

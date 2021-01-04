// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyIpCnameStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpCnameStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpCnameStatusResponseBody self = new ModifyIpCnameStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpCnameStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

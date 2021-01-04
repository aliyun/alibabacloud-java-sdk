// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDDoSProtectConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDDoSProtectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDDoSProtectConfigResponseBody self = new ModifyDDoSProtectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDDoSProtectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyUserCustomLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserCustomLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserCustomLogConfigResponseBody self = new ModifyUserCustomLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserCustomLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

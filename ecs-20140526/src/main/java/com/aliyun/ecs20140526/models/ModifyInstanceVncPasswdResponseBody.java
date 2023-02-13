// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVncPasswdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceVncPasswdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVncPasswdResponseBody self = new ModifyInstanceVncPasswdResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVncPasswdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiGroupInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupInstanceResponseBody self = new ModifyApiGroupInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ModifyInstanceStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStateResponseBody self = new ModifyInstanceStateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

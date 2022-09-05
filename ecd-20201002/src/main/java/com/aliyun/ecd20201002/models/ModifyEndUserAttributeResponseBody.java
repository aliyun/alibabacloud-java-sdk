// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ModifyEndUserAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEndUserAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEndUserAttributeResponseBody self = new ModifyEndUserAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEndUserAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

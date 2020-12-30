// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyAccessAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccessAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessAttributeResponseBody self = new ModifyAccessAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccessAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

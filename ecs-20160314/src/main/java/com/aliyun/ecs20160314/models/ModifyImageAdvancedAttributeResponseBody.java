// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyImageAdvancedAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImageAdvancedAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAdvancedAttributeResponseBody self = new ModifyImageAdvancedAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImageAdvancedAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

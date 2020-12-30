// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResponseBody self = new ModifyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

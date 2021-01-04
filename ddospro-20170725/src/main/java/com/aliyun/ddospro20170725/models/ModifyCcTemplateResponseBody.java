// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyCcTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCcTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCcTemplateResponseBody self = new ModifyCcTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCcTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

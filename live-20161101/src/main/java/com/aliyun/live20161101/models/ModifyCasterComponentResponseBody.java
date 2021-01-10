// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterComponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ComponentId")
    public String componentId;

    public static ModifyCasterComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterComponentResponseBody self = new ModifyCasterComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCasterComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCasterComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}

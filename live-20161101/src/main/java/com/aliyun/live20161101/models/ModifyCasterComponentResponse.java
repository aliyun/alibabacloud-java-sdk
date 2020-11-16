// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterComponentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ComponentId")
    @Validation(required = true)
    public String componentId;

    public static ModifyCasterComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterComponentResponse self = new ModifyCasterComponentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterComponentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCasterComponentResponse setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}

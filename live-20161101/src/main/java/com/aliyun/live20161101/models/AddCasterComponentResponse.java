// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ComponentId")
    @Validation(required = true)
    public String componentId;

    public static AddCasterComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterComponentResponse self = new AddCasterComponentResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterComponentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterComponentResponse setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}

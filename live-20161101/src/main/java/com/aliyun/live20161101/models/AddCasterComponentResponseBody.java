// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentResponseBody extends TeaModel {
    @NameInMap("ComponentId")
    public String componentId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddCasterComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterComponentResponseBody self = new AddCasterComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public AddCasterComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

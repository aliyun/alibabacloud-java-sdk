// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComponentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123123123123123</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>adssd****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentResponseBody self = new CreateComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public CreateComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

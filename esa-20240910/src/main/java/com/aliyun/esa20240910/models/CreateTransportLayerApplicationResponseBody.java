// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>165503967****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <strong>example:</strong>
     * <p>9e5448c7-edaf-49aa-9887-0fcd0832306c</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTransportLayerApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransportLayerApplicationResponseBody self = new CreateTransportLayerApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransportLayerApplicationResponseBody setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public CreateTransportLayerApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

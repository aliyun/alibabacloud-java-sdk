// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-880688675783794688</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEdgeContainerAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppResponseBody self = new CreateEdgeContainerAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateEdgeContainerAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

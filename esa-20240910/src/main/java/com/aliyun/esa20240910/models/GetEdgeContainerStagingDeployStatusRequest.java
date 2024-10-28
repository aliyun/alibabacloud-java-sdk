// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerStagingDeployStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>GetEdgeContainerStagingDeployStatus</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetEdgeContainerStagingDeployStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerStagingDeployStatusRequest self = new GetEdgeContainerStagingDeployStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerStagingDeployStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

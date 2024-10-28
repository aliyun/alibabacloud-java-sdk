// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerDeployRegionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>GetEdgeContainerDeployRegions</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetEdgeContainerDeployRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerDeployRegionsRequest self = new GetEdgeContainerDeployRegionsRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerDeployRegionsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

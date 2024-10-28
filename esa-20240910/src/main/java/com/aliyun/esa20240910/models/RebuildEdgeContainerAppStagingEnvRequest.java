// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RebuildEdgeContainerAppStagingEnvRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static RebuildEdgeContainerAppStagingEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildEdgeContainerAppStagingEnvRequest self = new RebuildEdgeContainerAppStagingEnvRequest();
        return TeaModel.build(map, self);
    }

    public RebuildEdgeContainerAppStagingEnvRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

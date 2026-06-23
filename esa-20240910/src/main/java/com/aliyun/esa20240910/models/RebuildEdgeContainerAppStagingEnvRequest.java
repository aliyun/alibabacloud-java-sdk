// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RebuildEdgeContainerAppStagingEnvRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
     * <blockquote>
     * <p>Notice: This parameter is required. If this parameter is not specified, the API returns InvalidParameter.appid (400). You can call ListEdgeContainerApps to obtain a valid application ID.
     * Dependency chain: CreateEdgeContainerApp (if not created) → CreateEdgeContainerAppVersion → PublishEdgeContainerAppVersion (environment=staging) → RebuildEdgeContainerAppStagingEnv
     * </notice></p>
     * </blockquote>
     * 
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

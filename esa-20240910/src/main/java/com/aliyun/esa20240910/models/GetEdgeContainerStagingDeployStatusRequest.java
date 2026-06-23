// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerStagingDeployStatusRequest extends TeaModel {
    /**
     * <p>The application ID. You can call <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> to obtain the application ID.</p>
     * <blockquote>
     * <p>Notice: AppId is required. If AppId is not specified, the API returns InvalidParameter.appid (400). You can call ListEdgeContainerApps to obtain the application ID. 
     * The AppId format is the prefix app- followed by 18 or more digits (at least 20 characters in total). You can obtain the actual value from the AppId field in the ListEdgeContainerApps response.
     * Complete call chain example: CreateEdgeContainerApp → Call ListEdgeContainerApps to obtain AppId → GetEdgeContainerStagingDeployStatus</notice>.</p>
     * </blockquote>
     * 
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

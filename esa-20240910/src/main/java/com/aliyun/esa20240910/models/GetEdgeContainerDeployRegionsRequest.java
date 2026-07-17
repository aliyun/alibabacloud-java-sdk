// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerDeployRegionsRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.&gt;Notice: This parameter is required. If this parameter is not specified, the service returns InvalidParameter.appid (400). You can call ListEdgeContainerApps to obtain a valid AppId. If you have not activated the Edge Container service, activate it first, and then call CreateEdgeContainerApp to create an application and obtain the AppId.
     * </notice></p>
     * 
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

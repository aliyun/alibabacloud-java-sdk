// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppLogRiverRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.
     * <notice>AppId is a required parameter. If this parameter is not specified, the API returns InvalidParameter.appid (400). You can call the ListEdgeContainerApps operation to obtain a valid AppId.</notice>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-880688675****88</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetEdgeContainerAppLogRiverRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppLogRiverRequest self = new GetEdgeContainerAppLogRiverRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppLogRiverRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

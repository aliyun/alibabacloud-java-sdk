// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerTerminalRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.
     * <notice>This parameter is required. If this parameter is not specified, the API returns InvalidParameter.appid(400).
     * Full dependency chain: CreateEdgeContainerApp → CreateEdgeContainerAppVersion → PublishEdgeContainerAppVersion → Wait for the container status to become Running → Call this API.</notice>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetEdgeContainerTerminalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerTerminalRequest self = new GetEdgeContainerTerminalRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerTerminalRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

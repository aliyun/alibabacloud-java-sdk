// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceReserveRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
     * <blockquote>
     * <p>Notice: This parameter is required. If this parameter is not specified, the service returns InvalidParameter.Appid (400).
     * If no applications exist under your account, call CreateEdgeContainerApp to create an application first, and then call ListEdgeContainerApps to obtain the AppId.
     * </notice>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetEdgeContainerAppResourceReserveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceReserveRequest self = new GetEdgeContainerAppResourceReserveRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceReserveRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

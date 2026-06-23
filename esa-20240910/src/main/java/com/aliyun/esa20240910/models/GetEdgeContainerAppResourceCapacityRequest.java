// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceCapacityRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> API operation to obtain the application ID.</p>
     * <blockquote>
     * <p>Notice: If ListEdgeContainerApps returns an empty list, call CreateEdgeContainerApp first to create an application and use the returned AppId.</notice></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetEdgeContainerAppResourceCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceCapacityRequest self = new GetEdgeContainerAppResourceCapacityRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceCapacityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

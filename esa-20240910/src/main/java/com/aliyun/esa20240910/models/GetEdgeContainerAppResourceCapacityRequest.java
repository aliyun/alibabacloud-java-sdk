// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceCapacityRequest extends TeaModel {
    /**
     * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
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

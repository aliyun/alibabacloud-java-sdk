// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID. 
     * <notice>AppId is required. If this parameter is not specified, the API returns InvalidParameter.appid (400). You can obtain the value by calling ListEdgeContainerApps.
     * The AppId value is in the format of the app- prefix followed by 18 or more digits (at least 20 characters in total). You can obtain the actual value from the AppId field in the ListEdgeContainerApps response.</notice>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1232321454***</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteEdgeContainerAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppRequest self = new DeleteEdgeContainerAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

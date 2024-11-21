// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppRequest extends TeaModel {
    /**
     * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
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

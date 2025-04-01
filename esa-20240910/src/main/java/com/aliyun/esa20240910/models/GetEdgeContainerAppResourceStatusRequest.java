// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-96253477062511****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetEdgeContainerAppResourceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceStatusRequest self = new GetEdgeContainerAppResourceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceReserveRequest extends TeaModel {
    /**
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

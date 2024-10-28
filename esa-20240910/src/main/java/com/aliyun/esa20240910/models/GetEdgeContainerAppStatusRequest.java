// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("PublishEnv")
    public String publishEnv;

    public static GetEdgeContainerAppStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppStatusRequest self = new GetEdgeContainerAppStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetEdgeContainerAppStatusRequest setPublishEnv(String publishEnv) {
        this.publishEnv = publishEnv;
        return this;
    }
    public String getPublishEnv() {
        return this.publishEnv;
    }

}

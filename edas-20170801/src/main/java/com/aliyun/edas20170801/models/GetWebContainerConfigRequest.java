// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetWebContainerConfigRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetWebContainerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebContainerConfigRequest self = new GetWebContainerConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetWebContainerConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

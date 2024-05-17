// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetAppDeploymentRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetAppDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppDeploymentRequest self = new GetAppDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public GetAppDeploymentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

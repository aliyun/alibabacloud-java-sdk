// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sServicesRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetK8sServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetK8sServicesRequest self = new GetK8sServicesRequest();
        return TeaModel.build(map, self);
    }

    public GetK8sServicesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

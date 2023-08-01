// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJavaStartUpConfigRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetJavaStartUpConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJavaStartUpConfigRequest self = new GetJavaStartUpConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetJavaStartUpConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

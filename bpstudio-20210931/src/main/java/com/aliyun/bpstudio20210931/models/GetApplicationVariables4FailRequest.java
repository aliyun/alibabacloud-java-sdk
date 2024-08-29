// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationVariables4FailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Q2P4O9YSOKCT35L9</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetApplicationVariables4FailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationVariables4FailRequest self = new GetApplicationVariables4FailRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationVariables4FailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationVariablesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Q2P4O9YSOKCQ35L9</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static GetApplicationVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationVariablesRequest self = new GetApplicationVariablesRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationVariablesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

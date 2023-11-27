// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetIMConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetIMConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIMConfigRequest self = new GetIMConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetIMConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

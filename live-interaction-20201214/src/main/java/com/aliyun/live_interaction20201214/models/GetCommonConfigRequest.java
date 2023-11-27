// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetCommonConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetCommonConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommonConfigRequest self = new GetCommonConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCommonConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

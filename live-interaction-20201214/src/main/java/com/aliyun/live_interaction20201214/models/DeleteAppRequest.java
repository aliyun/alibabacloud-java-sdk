// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class DeleteAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static DeleteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRequest self = new DeleteAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

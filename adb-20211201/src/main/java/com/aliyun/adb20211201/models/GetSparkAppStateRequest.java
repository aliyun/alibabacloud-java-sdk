// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppStateRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetSparkAppStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppStateRequest self = new GetSparkAppStateRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppStateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

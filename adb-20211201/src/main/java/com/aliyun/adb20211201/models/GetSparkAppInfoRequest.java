// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetSparkAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppInfoRequest self = new GetSparkAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

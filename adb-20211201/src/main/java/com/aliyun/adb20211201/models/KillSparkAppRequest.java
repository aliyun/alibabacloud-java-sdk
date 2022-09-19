// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static KillSparkAppRequest build(java.util.Map<String, ?> map) throws Exception {
        KillSparkAppRequest self = new KillSparkAppRequest();
        return TeaModel.build(map, self);
    }

    public KillSparkAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

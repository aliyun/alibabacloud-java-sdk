// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class PreloadSparkAppMetricsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static PreloadSparkAppMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadSparkAppMetricsRequest self = new PreloadSparkAppMetricsRequest();
        return TeaModel.build(map, self);
    }

    public PreloadSparkAppMetricsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

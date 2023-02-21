// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppMetricsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetSparkAppMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppMetricsRequest self = new GetSparkAppMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppMetricsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

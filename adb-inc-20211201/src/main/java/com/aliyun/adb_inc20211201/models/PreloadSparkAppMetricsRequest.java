// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class PreloadSparkAppMetricsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202204221525hzca7d8140000003</p>
     */
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

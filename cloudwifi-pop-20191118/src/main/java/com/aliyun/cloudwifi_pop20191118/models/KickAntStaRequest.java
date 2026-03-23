// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class KickAntStaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4fcb82c0-ee83-11ea-88b6-02420b0f63f4</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ISV_ALIYUN_IOT</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BA:5F:40:45:63:80</p>
     */
    @NameInMap("StaMac")
    public String staMac;

    public static KickAntStaRequest build(java.util.Map<String, ?> map) throws Exception {
        KickAntStaRequest self = new KickAntStaRequest();
        return TeaModel.build(map, self);
    }

    public KickAntStaRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public KickAntStaRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public KickAntStaRequest setStaMac(String staMac) {
        this.staMac = staMac;
        return this;
    }
    public String getStaMac() {
        return this.staMac;
    }

}

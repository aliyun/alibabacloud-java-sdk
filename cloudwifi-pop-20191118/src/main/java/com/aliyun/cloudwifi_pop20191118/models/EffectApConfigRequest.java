// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class EffectApConfigRequest extends TeaModel {
    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    public static EffectApConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        EffectApConfigRequest self = new EffectApConfigRequest();
        return TeaModel.build(map, self);
    }

    public EffectApConfigRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public EffectApConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public EffectApConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}

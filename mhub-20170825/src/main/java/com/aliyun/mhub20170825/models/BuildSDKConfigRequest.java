// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class BuildSDKConfigRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("OsType")
    public String osType;

    public static BuildSDKConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildSDKConfigRequest self = new BuildSDKConfigRequest();
        return TeaModel.build(map, self);
    }

    public BuildSDKConfigRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public BuildSDKConfigRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

}

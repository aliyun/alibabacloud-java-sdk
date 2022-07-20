// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class VersionCheckSameNameServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersionName")
    public String appVersionName;

    public static VersionCheckSameNameServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        VersionCheckSameNameServiceRequest self = new VersionCheckSameNameServiceRequest();
        return TeaModel.build(map, self);
    }

    public VersionCheckSameNameServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public VersionCheckSameNameServiceRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

}

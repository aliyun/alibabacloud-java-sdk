// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteIsvAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppVersion")
    public String appVersion;

    public static DeleteIsvAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIsvAppRequest self = new DeleteIsvAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIsvAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteIsvAppRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}

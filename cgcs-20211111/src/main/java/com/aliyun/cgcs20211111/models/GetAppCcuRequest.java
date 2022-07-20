// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppCcuRequest extends TeaModel {
    // 自定义会话id
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    // 平台会话id
    @NameInMap("ProjectId")
    public String projectId;

    public static GetAppCcuRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppCcuRequest self = new GetAppCcuRequest();
        return TeaModel.build(map, self);
    }

    public GetAppCcuRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppCcuRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetAppCcuRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

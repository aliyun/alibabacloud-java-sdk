// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadAppRequest extends TeaModel {
    @NameInMap("AppFileUrl")
    public String appFileUrl;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAppRequest self = new UploadAppRequest();
        return TeaModel.build(map, self);
    }

    public UploadAppRequest setAppFileUrl(String appFileUrl) {
        this.appFileUrl = appFileUrl;
        return this;
    }
    public String getAppFileUrl() {
        return this.appFileUrl;
    }

    public UploadAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CancelUploadTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("VersionId")
    public String versionId;

    public static CancelUploadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUploadTaskRequest self = new CancelUploadTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelUploadTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelUploadTaskRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}

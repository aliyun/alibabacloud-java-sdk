// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class SubmitOfflineTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("Uri")
    public String uri;

    @NameInMap("VersionId")
    public String versionId;

    public static SubmitOfflineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOfflineTaskRequest self = new SubmitOfflineTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOfflineTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SubmitOfflineTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SubmitOfflineTaskRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public SubmitOfflineTaskRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}

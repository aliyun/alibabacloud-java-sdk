// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class SubmitOfflineTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("Env")
    public String env;

    @NameInMap("Uri")
    public String uri;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("VersionName")
    public String versionName;

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

    public SubmitOfflineTaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SubmitOfflineTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SubmitOfflineTaskRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
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

    public SubmitOfflineTaskRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}

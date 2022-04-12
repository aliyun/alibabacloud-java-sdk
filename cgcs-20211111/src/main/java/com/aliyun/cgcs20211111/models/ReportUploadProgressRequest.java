// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReportUploadProgressRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 环境
    @NameInMap("Env")
    public String env;

    // 上传进度
    @NameInMap("Progress")
    public Double progress;

    // 版本ID
    @NameInMap("VersionId")
    public String versionId;

    public static ReportUploadProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadProgressRequest self = new ReportUploadProgressRequest();
        return TeaModel.build(map, self);
    }

    public ReportUploadProgressRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReportUploadProgressRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ReportUploadProgressRequest setProgress(Double progress) {
        this.progress = progress;
        return this;
    }
    public Double getProgress() {
        return this.progress;
    }

    public ReportUploadProgressRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}

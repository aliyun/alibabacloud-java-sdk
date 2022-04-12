// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReportUploadStatusRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 环境
    @NameInMap("Env")
    public String env;

    // 备注信息
    @NameInMap("Memo")
    public String memo;

    // 上传状态
    @NameInMap("Status")
    public String status;

    // 版本ID
    @NameInMap("VersionId")
    public String versionId;

    public static ReportUploadStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadStatusRequest self = new ReportUploadStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportUploadStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReportUploadStatusRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ReportUploadStatusRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ReportUploadStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ReportUploadStatusRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
